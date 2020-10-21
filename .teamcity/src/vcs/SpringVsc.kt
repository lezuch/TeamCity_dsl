package src.vcs

import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object SpringVsc : GitVcsRoot ({
    name = "SpringVsc"
    url = "https://github.com/lezuch/spring-petclinic.git"
    branch = "refs/heads/main"
})