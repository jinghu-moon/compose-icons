import java.io.FileOutputStream
import java.net.URL
import java.nio.channels.Channels
import java.util.zip.ZipFile

plugins {
    base
}

val usvgVersion = "0.47.0" // Pin to specific version

val downloadUsvg = tasks.register("resolveUsvg") {
    group = "tools"
    description = "Downloads and extracts the usvg binary for the current OS/Arch"
    
    inputs.property("usvgVersion", usvgVersion)

    val osName = System.getProperty("os.name").lowercase()
    val osArch = System.getProperty("os.arch").lowercase()

    val targetDir = project.rootDir.resolve("tools")
    val binaryName = if (osName.contains("win")) "usvg.exe" else "usvg"
    val targetBinary = targetDir.resolve(binaryName)

    outputs.file(targetBinary)

    doLast {
        if (targetBinary.exists()) {
            println("usvg binary already exists at ${targetBinary.absolutePath}")
            return@doLast
        }

        val platformSuffix = when {
            osName.contains("win") -> "win64.zip"
            osName.contains("mac") -> {
                if (osArch == "aarch64" || osArch == "arm64") "macos-aarch64.zip"
                else "macos-x86_64.zip"
            }
            osName.contains("linux") -> {
                if (osArch == "aarch64" || osArch == "arm64") {
                    error("usvg v$usvgVersion does not provide a Linux ARM binary. Build from source: refer/resvg-main")
                } else "linux-x86_64.tar.gz"
            }
            else -> error("Unsupported OS: $osName")
        }

        val archiveName = "usvg-$platformSuffix"
        val downloadUrl = "https://github.com/linebender/resvg/releases/download/v$usvgVersion/$archiveName"
        
        targetDir.mkdirs()
        val downloadedFile = targetDir.resolve(archiveName)
        
        println("Downloading usvg from $downloadUrl...")
        try {
            java.net.URI(downloadUrl).toURL().openStream().use { input ->
                Channels.newChannel(input).use { rbc ->
                    FileOutputStream(downloadedFile).use { fos ->
                        fos.channel.transferFrom(rbc, 0, Long.MAX_VALUE)
                    }
                }
            }
            
            println("Extracting usvg...")
            if (archiveName.endsWith(".zip")) {
                ZipFile(downloadedFile).use { zip ->
                    val entries = zip.entries()
                    while (entries.hasMoreElements()) {
                        val entry = entries.nextElement()
                        if (!entry.isDirectory && entry.name.endsWith(binaryName)) {
                            zip.getInputStream(entry).use { input ->
                                targetBinary.outputStream().use { output ->
                                    input.copyTo(output)
                                }
                            }
                            targetBinary.setExecutable(true)
                            break
                        }
                    }
                }
            } else {
                // For linux tar.gz, run tar command
                val process = ProcessBuilder("tar", "-xzf", downloadedFile.absolutePath, "-C", targetDir.absolutePath)
                    .start()
                process.waitFor()
                
                // Find extracted dir starting with usvg-
                val extractedDirs = targetDir.listFiles { file -> 
                    file.isDirectory && file.name.startsWith("usvg-") && file.name != "usvg"
                }
                val extractedDir = extractedDirs?.firstOrNull()
                
                if (extractedDir != null && extractedDir.exists()) {
                    extractedDir.resolve("usvg").copyTo(targetBinary, overwrite = true)
                    extractedDir.deleteRecursively()
                } else {
                    // if it extracts directly
                    val directExtracted = targetDir.resolve("usvg")
                    if (directExtracted.exists() && directExtracted != targetBinary) {
                        directExtracted.copyTo(targetBinary, overwrite = true)
                        directExtracted.delete()
                    }
                }
                targetBinary.setExecutable(true)
            }
            println("Successfully resolved usvg to ${targetBinary.absolutePath}")
        } catch (e: Exception) {
            System.err.println("Failed to download usvg. Please manually download $downloadUrl, extract usvg, and place it at ${targetBinary.absolutePath}")
            throw e
        } finally {
            if (downloadedFile.exists()) {
                downloadedFile.delete()
            }
        }
    }
}

tasks.register<Exec>("buildSvg2Compose") {
    description = "Compile svg2compose Rust CLI for Windows"
    group = "build"
    workingDir = file("svg2compose")
    commandLine("cmd", "/c", "cargo", "build", "--release")
    inputs.dir("svg2compose/src")
    inputs.file("svg2compose/Cargo.toml")
    outputs.file("svg2compose/target/release/svg2compose.exe")
}

tasks.register<Copy>("installSvg2Compose") {
    description = "Copy svg2compose.exe to tools/ directory"
    dependsOn("buildSvg2Compose")
    from("svg2compose/target/release/svg2compose.exe")
    into(projectDir)
}
