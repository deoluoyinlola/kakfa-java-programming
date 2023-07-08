plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
    testImplementation("org.apache.kafka:kafka-clients:3.5.0")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    testImplementation("org.slf4j:slf4j-api:1.7.36")
    // implementation 'org.slf4j:slf4j-api:<version>'

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
    testImplementation("org.slf4j:slf4j-simple:1.7.36")

}

tasks.test {
    useJUnitPlatform()
}



