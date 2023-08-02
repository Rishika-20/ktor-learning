plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.learningktor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-server-core:1.6.4")
    implementation("io.ktor:ktor-server-netty:1.6.4")
    //implementation("org.slf4j:slf4j-api:2.0.7")
    testImplementation("org.slf4j:slf4j-simple:2.0.7")
    testImplementation("ch.qos.logback:logback-classic:1.2.6")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}