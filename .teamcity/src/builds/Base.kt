package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.Template
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import src.consts.Platform


object Base: Template({
    name = "base"
	steps {
		script {
			name = "Upload dist"
			id = "upload_dist"
			workingDir = "build"
			scriptContent = """
            #!/bin/bash
			set -e
			
            if [ "%upload_dist%" = "true" ]; then
            echo "Upload dist"
			echo ${'$'}APPLE_USERNAME
			echo ${'$'}APPLE_PASSWORD
			else
            echo "Upload dist disable step skipped"
            fi
            """.trimIndent()
			conditions {
				exists("upload_dist")
				equals("upload_dist", "true")
			}
		}
	}
})