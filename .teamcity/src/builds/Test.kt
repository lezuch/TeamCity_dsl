package src.builds


import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script


object Test : BuildType({
	
	params {
		if ( "%force.path.af%" == "1" ) {
			text("artifactory.path", "/dir/forced", display = ParameterDisplay.HIDDEN)
		}
		
	}
	
    steps {
		script {
			name = "Test"
			scriptContent = """
				echo "%artifactory.path%"
			""".trimIndent()
		}
	}
})