plugins {
    id("java-library")
    id("chirp.spring-boot-service")
    kotlin("plugin.jpa")
}

group = "com.sonu"
version = "unspecified"

dependencies {
    implementation(projects.common)
    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)
}