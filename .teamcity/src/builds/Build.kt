package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import src.vcs.SpringVsc

object Build : BuildType({
    name = "Build and Test"

    artifactRules = "target => target"

    vcs {
        root(SpringVsc)
    }

    steps {
        maven {
            goals = "package"
        }
    }

    triggers {
        vcs {
        }
    }
})
