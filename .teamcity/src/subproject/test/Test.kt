package src.subproject.test

import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BaseBuild
import src.subproject.dev.GetArtifact

object Test : Project ({
    name = "Test"
    buildType(BaseBuild("Build_Test"))
    buildType(GetArtifact)
    params{
        text("teamcity.ui.settings.readOnly", "true", display = ParameterDisplay.HIDDEN)
    }

})
