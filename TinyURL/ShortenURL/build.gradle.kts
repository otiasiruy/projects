plugins {
    id("java")
    id("war") // Required for Liberty
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Use Spring Framework 6 (latest stable version)
    implementation("org.springframework:spring-webmvc:6.1.2")
    // Spring Context (Important for Web Application Context)
    implementation("org.springframework:spring-context:6.1.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")

    // Jakarta EE API (Servlet 5.0+)
    implementation("jakarta.servlet:jakarta.servlet-api:5.0.0") // Liberty requires this
    compileOnly("jakarta.servlet.jsp:jakarta.servlet.jsp-api:3.0.0") // JSP if needed

    // Logging
    implementation("ch.qos.logback:logback-classic:1.4.14")

    // Unit Testing
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}