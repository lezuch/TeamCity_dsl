package src.builds

open class BaseBuild(buildName: String)
    : PlatformBase({
    name = buildName
    artifactRules = """
        vsc_joba.txt
    """.trimIndent()

})