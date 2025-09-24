plugins {
    id("chirp.spring-boot-app")
}

group = "com.sonu"
version = "0.0.1-SNAPSHOT"
description = "Chirp Backend"

dependencies {
    implementation(projects.common)
    implementation(projects.chat)
    implementation(projects.notification)
    implementation(projects.user)

    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)
}
