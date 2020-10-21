package src.subproject

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.Build
import src.vcs.SpringVsc

object Test : Project ({
    name = "Test"
    vcsRoot(SpringVsc)
    buildType(Build)
})
