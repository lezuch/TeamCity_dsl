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
                
                VCS_URL=%vcsroot.url%
                echo "z TESTA"
                echo "VCS_URL = ${'$'}{VCS_URL}" > vsc_joba.txt
            """.trimIndent()
        }
    }
})