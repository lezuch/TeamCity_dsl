package src.builds

import jetbrains.buildServer.configs.kotlin.v2017_2.toId

open class BaseBuild(buildName: String)
    : PlatformBase({
    name = buildName
    id(name.toId())

})