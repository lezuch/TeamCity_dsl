package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.CheckoutMode
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import src.vcs.SpringVsc

open class BuildUtils(block: BuildType.() -> Unit ):  BuildType({
    vcs {
        root(SpringVsc, "+:utlis => utils")
        checkoutMode = CheckoutMode.ON_AGENT
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
                echo "ls ../"
                ls ../ 
                echo "ls ./"
                ls .              
            """.trimIndent()
        }
    }
    apply(block)
})