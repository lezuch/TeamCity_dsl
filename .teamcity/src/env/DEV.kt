package src.env


import jetbrains.buildServer.configs.kotlin.v2019_2.Project


object DEV : Project ({
	name = "DEV"
	buildType(buildDev)

})