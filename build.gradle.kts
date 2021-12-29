import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "org.kalasim.examples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
//    mavenLocal()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation(kotlin("script-runtime"))
    implementation("com.github.holgerbrandl:kalasim:0.7.90")
}

tasks.test {
    useJUnitPlatform()
}


application {
    mainClass.set("MainKt")
}