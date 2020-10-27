package src.subproject.test

import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Test : Project ({
    name = "Test"
    buildType(GetArtifactTest)
    buildType(BuildUtilsTest)
    params{
        text("teamcity.ui.settings.readOnly", "true", display = ParameterDisplay.HIDDEN)
        text("build.prefix", "TEST", display = ParameterDisplay.HIDDEN)
    }

})
