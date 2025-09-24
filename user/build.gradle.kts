plugins {
    id("java-library")
    id("chirp.spring-boot-service")
    kotlin("plugin.jpa")
}

group = "com.sonu"
version = "unspecified"

dependencies {
    implementation(projects.common)
}