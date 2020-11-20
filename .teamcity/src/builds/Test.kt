package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Test : BuildType({
	name = "TEST"
	
	
	steps {
		script {
			name="Colect info about VSC"
			scriptContent="""
                #!/bin/bash
                echo "MAIN"
                
            """.trimIndent()
		}
	}
})