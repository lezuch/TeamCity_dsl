package src.subproject.dev

import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Dev : Project ({
    name = "Dev"
    buildType(GetArtifactDev)
    buildType(BuildUtilsDev)
    params{
        text("teamcity.ui.settings.readOnly", "true", display = ParameterDisplay.HIDDEN)
        text("build.prefix", "DEV", display = ParameterDisplay.HIDDEN)
    }

})
