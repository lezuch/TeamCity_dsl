package src.builds


import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import src.consts.Platform


open class Test(block: BuildType.() -> Unit) : Base(Platform.IOS, {
	name = "TestBuild"
	
	steps {
		script {
			name = "Prod"
			scriptContent = """
				echo "prod"
			""".trimIndent()
		}
	}
})

