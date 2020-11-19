package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import src.vcs.SpringVsc

object PrepareArtifact : BuildType({
    name = "PrepareArtifact"


    steps {
        script {
            name="Colect info about VSC"
            scriptContent="""
                #!/bin/bash

                echo "z TESTA"
            """.trimIndent()
        }
    }
})