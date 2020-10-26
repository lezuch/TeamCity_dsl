package src.subproject.dev

import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BuildUtils

object Dev : Project ({
    name = "Dev"
    buildType(GetArtifactDev)
    buildType(BuildUtils)
    params{
        text("teamcity.ui.settings.readOnly", "true", display = ParameterDisplay.HIDDEN)
        text("build.prefix", "DEV", display = ParameterDisplay.HIDDEN)
    }

})
