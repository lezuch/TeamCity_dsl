package src.builds

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.FailureAction

open class BaseBuild(block: BuildType.() -> Unit ) : BuildType({
    buildNumberPattern = "1.0.%build.counter%"
    dependencies{
        dependency(PrepareArtifact){
            snapshot{
                onDependencyFailure =  FailureAction.CANCEL
            }
            artifacts {
                cleanDestination = true
                artifactRules = "vsc_joba.txt"
            }
        }
    }
    apply(block)
})