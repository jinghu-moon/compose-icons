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
    // 10 涓浘鏍囧簱鐨勭敓鎴愬櫒鍏ュ彛 鈥斺€?CLI 閫氳繃杩欎簺寮曠敤鍚勮嚜鐨?IconSource 瀹炵幇
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
