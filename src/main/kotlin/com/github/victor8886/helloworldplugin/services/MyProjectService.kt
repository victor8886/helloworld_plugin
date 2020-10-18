package com.github.victor8886.helloworldplugin.services

import com.intellij.openapi.project.Project
import com.github.victor8886.helloworldplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
