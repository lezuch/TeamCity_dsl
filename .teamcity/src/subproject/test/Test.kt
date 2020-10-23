package src.subproject.test

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BaseBuild
import src.vcs.SpringVsc

object Test : Project ({
    name = "Test"
    vcsRoot(SpringVsc)
    buildType(BaseBuild("Build_Test"))

})
