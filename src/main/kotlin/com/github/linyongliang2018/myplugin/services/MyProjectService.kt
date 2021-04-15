package com.github.linyongliang2018.myplugin.services

import com.github.linyongliang2018.myplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
