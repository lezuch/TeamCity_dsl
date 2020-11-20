package src.builds

import jetbrains.buildServer.configs.kotlin.v10.toExtId
import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import src.vcs.MyVcsRoot

class Maven(name: String, goals: String, runnerArgs: String? = null): BuildType({
	id(name.toExtId())
	this.name = name
	
	vcs {
		root(MyVcsRoot)
	}
	
	steps {
		maven {
			this.goals = goals
			this.runnerArgs = runnerArgs
		}
	}
})