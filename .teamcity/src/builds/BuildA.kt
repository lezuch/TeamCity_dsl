package src.builds

/*object BuildA : BuildType({
    name = "Job A"

    artifactRules = """
        vsc_joba.txt
        target => target
    """.trimIndent()

    vcs {
        root(SpringVsc)
    }

    steps {
        maven {
            goals = "package"
        }
        script {
            name="Colect info about VSC"
            scriptContent="""
                #!/bin/bash

                VCS_URL=${'$'}(echo "%vcsroot.url%")
                echo "VCS_URL = ${'$'} {VCS_URL}" > vsc_joba.txt
            """.trimIndent()
        }
    }

    triggers {
        vcs {
        }
    }
})*/

class BuildAclass()
    : PlatformBase({
    name = "BuildAclass"
})