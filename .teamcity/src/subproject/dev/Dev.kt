package src.subproject.dev

import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BaseBuild

object Dev : Project ({
    name = "Dev"
    buildType(BaseBuild("Build_Dev"))
    params{
        text("teamcity.ui.settings.readOnly", "true", display = ParameterDisplay.HIDDEN)
    }

})
