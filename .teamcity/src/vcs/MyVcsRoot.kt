package src.vcs

import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object MyVcsRoot : GitVcsRoot ({
    name = "MyVcsRoot"
    url = "git@github.com:lezuch/anewtodolist.git"
    branch = "refs/heads/main"
    authMethod = uploadedKey {
        uploadedKey = "TC"
    }
})