plugins {
    java
    maven
}

group = "com.mdlaf"
version = "0.9.3.3"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.swinglabs", "swingx", "1.6.1")
}

val sourcesJar by tasks.creating(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles sources JAR"
    classifier = "sources"
    from(sourceSets.getAt("main").allSource)
}

artifacts.add("archives", sourcesJar)