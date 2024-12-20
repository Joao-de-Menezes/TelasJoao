pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // Adiciona JitPack
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // Adiciona JitPack
    }
}

rootProject.name = "Telas"
include(":app")