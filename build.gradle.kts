plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

val junitVersion = "5.13.4"
val mockitoVersion = "5.19.0"
val assertJVersion = "3.27.4"

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:${junitVersion}"))
    testImplementation(platform("org.mockito:mockito-bom:${mockitoVersion}"))
    testImplementation(platform("org.assertj:assertj-bom:${assertJVersion}"))

    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.mockito:mockito-junit-jupiter")
    testImplementation("org.assertj:assertj-core")
}

tasks.test {
    useJUnitPlatform()
}