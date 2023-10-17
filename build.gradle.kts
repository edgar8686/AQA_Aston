plugins {
    id("java")
    id("project-report")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")
    implementation("org.seleniumhq.selenium:selenium-java:4.12.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.5.3")
    implementation("commons-io:commons-io:2.11.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.1")
    //implementation 'ch.qos.logback:logback-core:1.4.5'
    testImplementation("org.slf4j:slf4j-simple:2.0.6")
    //testImplementation 'ch.qos.logback:logback-classic:1.4.5'
    testImplementation("io.qameta.allure:allure-junit5:2.20.1")
    implementation("io.qameta.allure:allure-java-commons:2.20.1")
    implementation("io.qameta.allure:allure-commandline:2.20.1")
    testImplementation("io.qameta.allure:allure-assertj:2.20.1")
    testImplementation("io.qameta.allure:allure-selenide:2.20.1")
    implementation("com.opencsv:opencsv:5.7.1")
    runtimeOnly("org.aspectj:aspectjweaver:1.9.19")
}

tasks.test {
    useJUnitPlatform()
}