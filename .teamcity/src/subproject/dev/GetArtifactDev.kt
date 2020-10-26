package src.subproject.dev

import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import src.builds.BaseBuild
import src.builds.PrepareArtifact

object GetArtifactDev : BaseBuild ({
    name = "GetArtifactform"
    buildNumberPattern = "${PrepareArtifact.depParamRefs.buildNumber}"

    steps {
        script {
            name = "Job A"
            scriptContent = """
                #!/bin/bash
                echo "To jest job dla Dev"
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


