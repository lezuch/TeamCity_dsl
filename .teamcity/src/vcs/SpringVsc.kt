package src.vcs

import jetbrains.buildServer.configs.kotlin.v2017_2.toId
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object SpringVsc : GitVcsRoot ({
    name = "SpringVsc"
    id(name.toId())
    url = "git@github.com:lezuch/spring-petclinic.git"
    branch = "refs/heads/main"

    authMethod = uploadedKey {
        uploadedKey = "TC"
    }

})