package src.env

import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object PROD: Project({
	name = "PROD"
	params {
		checkbox("upload_dist", "false", checked = "true", unchecked = "false", label = "Upload dist file", display = ParameterDisplay.PROMPT)
		text("env.APPLE_USERNAME", "TEST", display = ParameterDisplay.HIDDEN)
		text("env.APPLE_PASSWORD", "PASS", display = ParameterDisplay.HIDDEN)
	}
	buildType(TestPROD)
})