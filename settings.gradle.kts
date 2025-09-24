pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
}
rootProject.name = "chirp"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("app")
include("user")
include("notification")
include("common")
include("chat")