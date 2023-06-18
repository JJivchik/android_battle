plugins {
    id("java")
}

group = "org.jiv"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation (platform("org.junit:junit-bom:5.9.1"))
    testImplementation ("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/org.springframework/spring-core
    implementation("org.springframework:spring-core:6.0.10")
    // https://mvnrepository.com/artifact/org.springframework/spring-context
    implementation("org.springframework:spring-context:6.0.10")
    // https://mvnrepository.com/artifact/org.springframework/spring-beans
    implementation("org.springframework:spring-beans:6.0.10")
    // https://mvnrepository.com/artifact/org.springframework/spring-expression
    implementation("org.springframework:spring-expression:6.0.10")



}

tasks.test {

    useJUnitPlatform()
}