plugins {
    base
}

val svg2composeDir = file("svg2compose")
val isWindows = System.getProperty("os.name").lowercase().contains("win")
val binaryExt = if (isWindows) ".exe" else ""
val binaryName = "svg2compose$binaryExt"

tasks.register<Exec>("buildSvg2Compose") {
    description = "Compile svg2compose Rust CLI"
    group = "tools"
    workingDir = svg2composeDir
    if (isWindows) {
        commandLine("cmd", "/c", "cargo", "build", "--release")
    } else {
        commandLine("cargo", "build", "--release")
    }
    inputs.dir("svg2compose/src")
    inputs.file("svg2compose/Cargo.toml")
    outputs.file("svg2compose/target/release/$binaryName")
}

tasks.register<Copy>("installSvg2Compose") {
    description = "Copy svg2compose binary to tools/ directory"
    dependsOn("buildSvg2Compose")
    from("svg2compose/target/release/$binaryName")
    into(projectDir)
}

tasks.register("resolveSvg2Compose") {
    group = "tools"
    description = "Build and install svg2compose Rust CLI"
    dependsOn("installSvg2Compose")
}
