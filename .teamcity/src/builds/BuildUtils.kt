package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import src.vcs.SpringVsc

object BuildUtils : BuildType({
    name = "BuildUtils"

    vcs {
        root(SpringVsc, "+:utlis => .")
    }
    triggers {
        vcs {
            triggerRules = "+:test"
            branchFilter = ""
        }
    }
    steps {
        script {
            name = "BuildUtils"
            scriptContent = """
                #!/bin/bash
                ls . 

            """.trimIndent()
        }
    }
})