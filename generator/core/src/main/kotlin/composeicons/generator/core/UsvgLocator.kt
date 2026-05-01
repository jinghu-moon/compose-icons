package composeicons.generator.core

import java.io.File

class UsvgLocator(
    private val projectRoot: File,
) {
    fun resolve(): File {
        val candidates = listOf(
            projectRoot.resolve("tools/usvg.exe"),
            projectRoot.resolve("tools/usvg"),
        )

        return candidates.firstOrNull { it.isFile } ?: error(
            "Unable to locate usvg binary. Please run `./gradlew :tools:resolveUsvg` to download it. Expected one of: ${candidates.joinToString()}",
        )
    }
}
