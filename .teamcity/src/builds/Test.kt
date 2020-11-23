package src.builds


import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script


object Test : BuildType({
	name ="Build-TEST"

	
    steps {
		script {
			name = "test2"
			scriptContent = """
			
			echo "##teamcity[setParameter name='artifactory.path' value='test']"
			""".trimIndent()
			conditions {
				doesNotExist("force.path.af")
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