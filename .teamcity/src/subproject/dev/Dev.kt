package src.subproject.dev

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BaseBuild
import src.vcs.SpringVsc

object Dev : Project ({
    name = "Dev"
    vcsRoot(SpringVsc)
    buildType(BaseBuild("Build_Dev"))

})
