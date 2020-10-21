package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.FailureAction
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.finishBuildTrigger
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
        script {
            name = "Display output form JobA"
            workingDir = "build"
            scriptContent = """
                #!/bin/bash
              
                cat ../vsc_joba.txt
            """.trimIndent()
        }
    }

    triggers {
        vcs {
        }
        finishBuildTrigger {
            buildType = "${BuildA.id}"
            successfulOnly = true
        }
    }

    dependencies{
        dependency(BuildA){
            snapshot{
                onDependencyFailure =  FailureAction.CANCEL
            }
            artifacts {
                cleanDestination = true
                artifactRules = "vsc_joba.txt"
            }
        }
    }
})

