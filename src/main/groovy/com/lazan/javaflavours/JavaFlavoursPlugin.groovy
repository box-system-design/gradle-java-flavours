package com.lazan.javaflavours

import org.gradle.api.Plugin
import org.gradle.api.Project

class JavaFlavoursPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.with {
            apply plugin: 'java'
            extensions.add('javaFlavours', new JavaFlavoursExtension(project))
        }
    }
}
