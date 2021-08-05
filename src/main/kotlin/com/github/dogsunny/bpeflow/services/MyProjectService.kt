package com.github.dogsunny.bpeflow.services

import com.github.dogsunny.bpeflow.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
