plugins {
    alias(libs.plugins.kotlin.jvm)
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    testImplementation(libs.kotlin.test)
    testImplementation(libs.junit4)
}

tasks.test {
    dependsOn(":tools:resolveUsvg")
}
