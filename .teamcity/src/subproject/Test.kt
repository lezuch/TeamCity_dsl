package src.subproject

import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import src.builds.BuildAclass
import src.builds.BuildB

object Test : Project ({
    name = "Test"
    val buildaformclass = BuildAclass()
    buildType(buildaformclass)
    buildType(BuildB)
})
