package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import src.vcs.SpringVsc

object BuildB : BuildType({
    name = "Job B"

    vcs {
        root(SpringVsc)
    }

    steps {
        script {
            name = "Job A"
            scriptContent = """
                #!/bin/bash
                echo "Start Job B"
            """.trimIndent()
        }
    }

    triggers {
        vcs {
        }
    }
})
