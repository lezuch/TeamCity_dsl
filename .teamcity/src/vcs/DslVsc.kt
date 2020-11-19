package src.vcs

import jetbrains.buildServer.configs.kotlin.v2017_2.toId
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object DslVsc : GitVcsRoot({
    name = "DslVsc"
    id(name.toId())
    url = "git@github.com:lezuch/TeamCity_dsl.git"
    branch = ""

    authMethod = uploadedKey {
        uploadedKey = "TC"
    }
})