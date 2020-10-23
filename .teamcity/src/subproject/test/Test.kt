package src.subproject.test

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BaseBuild

object Test : Project ({
    name = "Test"
    buildType(BaseBuild("Build_Test"))
})
