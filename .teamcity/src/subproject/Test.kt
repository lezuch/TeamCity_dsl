package src.subproject

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BaseBuild

object Test : Project ({
    name = "Test"
    val jobb = BaseBuild("JobB")
    buildType(jobb)
})
