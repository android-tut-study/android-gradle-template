plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    google()
    mavenCentral()
    jcenter() // Warning: this repository is going to shut down soon
    gradlePluginPortal()
}

gradlePlugin {
    plugins.register("ui-plugin") {
        id = "ui-plugin"
        implementationClass = "com.example.android.gradle.configuration.ui.UIPlugin"
    }
}

dependencies {
    implementation(libs.gradle.build.tool)
    implementation(libs.kotlin.gradle.plugin)
}
