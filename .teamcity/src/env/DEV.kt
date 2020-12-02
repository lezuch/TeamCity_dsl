package src.env


import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project


object DEV: Project({
	name = "DEV"
	params {
		text("env.APPLE_USERNAME", "TEST", display = ParameterDisplay.HIDDEN)
		text("env.APPLE_PASSWORD", "PASS", display = ParameterDisplay.HIDDEN)
	}
	buildType(buildDev)
})