pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "IBIProductsApp"
include(":app")
include(":core:ui")
include(":feature:home")
include(":feature:product")
include(":feature:favourite")
include(":feature:settings")
include(":feature:authentication")
include(":data")
include(":domain")
