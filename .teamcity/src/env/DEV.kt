package src.env

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.Base

object DEV : Project ({
	name = "DEV"
	buildType(buildDev)

})