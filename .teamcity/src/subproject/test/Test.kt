package src.subproject.test

import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Test : Project ({
    name = "Test"
    buildType(GetArtifactTest)
    params{
        text("teamcity.ui.settings.readOnly", "true", display = ParameterDisplay.HIDDEN)
    }

})
