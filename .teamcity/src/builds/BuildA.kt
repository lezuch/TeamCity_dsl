package src.builds

class BuildAclass()
    : PlatformBase({
    name = "JobA"
    artifactRules = """
        vsc_joba.txt
        target => target
    """.trimIndent()

})