package src.builds


import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script


object Test : BuildType({
	name ="Build-TEST"
	params {
		if ( "%force.path.af%" == "1" ) {
			text("artifactory.path", "/dir/forced", display = ParameterDisplay.HIDDEN)
		}
	}
	
    steps {
		script {
			name = "test2"
			scriptContent = """
			
			echo "##teamcity[setParameter name='' value='${'$'}PROC_NUM']"
			""".trimIndent()
			conditions {
				equals("force.path.af", "1")
			}
		}
		script {
			name = "Test"
			scriptContent = """
				echo "%artifactory.path%"
			""".trimIndent()
		}

	}
	
})