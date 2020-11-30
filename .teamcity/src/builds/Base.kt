package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import src.consts.Platform


open class Base(block: BuildType.() -> Unit): BuildType({
 
	steps {
    	script {
    		name = "Test"
			scriptContent = """
				echo "test"
			""".trimIndent()
		}
	}
})