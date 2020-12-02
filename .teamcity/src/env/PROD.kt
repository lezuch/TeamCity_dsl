package src.env

import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object PROD: Project({
	name = "PROD"
	
	buildType(TestPROD)
})