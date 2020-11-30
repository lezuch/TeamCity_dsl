package src.env

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.Test

object PROD: Project({
	name = "PROD"
	buildType(TestPROD)
})