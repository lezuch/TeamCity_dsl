package src.subproject

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BaseBuild

object Dev : Project ({
    name = "Dev"
    val jobA = BaseBuild("JobA")
    buildType(jobA)

})
