plugins {
    id("java")
}

group = "de.phl.programmingproject"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.beanshell:bsh-core:2.0b4")
    testImplementation("org.mockito:mockito-inline:3.12.1")
}

tasks.test {
    useJUnitPlatform()
}

// set Java to 8 for compatibility with GitHub Classroom Autograding
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}