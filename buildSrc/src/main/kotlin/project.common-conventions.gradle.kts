plugins {
    `java-library`
}

repositories {
    mavenLocal()
    maven("https://repo.codemc.io/repository/nms/")
    maven("https://repo.unnamed.team/repository/unnamed-public/")
    mavenCentral()
}

tasks {
    java {
        toolchain {
            languageVersion.set(
                    JavaLanguageVersion.of(
                            "${findProperty("java")}"
                    )
            )
        }
    }

    compileJava {
        options.compilerArgs.add("-parameters")
    }
}