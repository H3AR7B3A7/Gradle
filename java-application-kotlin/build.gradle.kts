plugins {
//    java
//    `java-library`
    application
}

java {
    // To enforce compatibility with Java 8
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8 // Defaults to sourceCompatibility if not set
    // Javadoc configuration (separate jar from sources)
    withJavadocJar()
    withSourcesJar()
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
    }
    test {
        java {
            setSrcDirs(listOf("test/src"))
        }
    }
}

application {
    mainClass.set("be.dog.d.steven.Repository")
}

dependencies {
    implementation(files ("lib/log4j-1.2.8.jar", "lib/junit-3.8.1.jar", "lib/jaxb-api-2.3.1.jar"))
}

version = "1.0-SNAPSHOT"