package src.builds

open class BaseBuild(buildName: String)
    : PlatformBase({
    val currentId = "${buildName}_job"
    id(currentId)
    name = buildName

})