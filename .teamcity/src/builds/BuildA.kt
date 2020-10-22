package src.builds

open class BuildAclass()
    : PlatformBase({
    name = "JobA"
    artifactRules = """
        vsc_joba.txt
    """.trimIndent()

})