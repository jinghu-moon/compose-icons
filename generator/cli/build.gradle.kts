plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin { jvmToolchain(21) }

application {
    mainClass.set("composeicons.generator.cli.MainKt")
}

dependencies {
    implementation(project(":generator:core"))
    // 10 个图标库的生成器入口 —— CLI 通过这些引用各自的 IconSource 实现
    implementation(project(":generator:tabler"))
    implementation(project(":generator:lucide"))
    implementation(project(":generator:phosphor"))
    implementation(project(":generator:remix"))
    implementation(project(":generator:radix"))
    implementation(project(":generator:heroicons"))
    implementation(project(":generator:iconoir"))
    implementation(project(":generator:ionicons"))
    implementation(project(":generator:bootstrap"))
    implementation(project(":generator:boxicons"))
}
