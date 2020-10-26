package src.subproject.test

import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import src.builds.BaseBuild
import src.builds.PrepareArtifact


object GetArtifactTest : BaseBuild({
    name = "GetArtifactform"
    buildNumberPattern = "%build.prefix%_${PrepareArtifact.depParamRefs.buildNumber}"

    steps {
        script {
            name = "Job A"
            scriptContent = """
                #!/bin/bash
                echo "To jest job dla Test"
            """.trimIndent()
        }
        script {
            name = "Display output"
            workingDir = "build"
            scriptContent = """
                #!/bin/bash
              
                cat ../vsc_joba.txt
            """.trimIndent()
        }
    }
})