package src.subproject.dev

import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import src.builds.BaseBuild

//val buildDev = BaseBuild("Build_Dev")

object GetArtifact : BaseBuild ({
    name = "GetArtifactform"

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
})


