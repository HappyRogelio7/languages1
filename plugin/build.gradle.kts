import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    id("project.common-conventions")
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

tasks {
    shadowJar {
        archiveBaseName.set(rootProject.name)
        archiveClassifier.set("")
    }

    named<DefaultTask>("build") {
        dependsOn("shadowJar")
    }
}

dependencies {
    implementation(libs.annotations)
    implementation(libs.message.sourcetype.bukkit)
    implementation(libs.commandflow)
    implementation(project(":api"))
    implementation(libs.inject)
    compileOnly(libs.spigot)
}

bukkit {
    val projectName = "${findProperty("plugin-name")}"

    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    main = "com.zittla.${projectName.toLowerCase()}.LanguagePlugin"
    apiVersion = "1.13"
    version = "${project.version}"
    authors = listOf("Zyran")
    description = "${findProperty("plugin-description")}"
    name = projectName
}
