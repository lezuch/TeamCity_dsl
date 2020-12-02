package src.env

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import src.builds.Base

object TestPROD : BuildType({
	name = "builProf"
	templates(Base)
	
})