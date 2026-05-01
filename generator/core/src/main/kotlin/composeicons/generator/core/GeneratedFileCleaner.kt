package composeicons.generator.core

import java.io.File

object GeneratedFileCleaner {

    fun clean(
        baseOutputDir: File,
        styleDirectories: List<String>,
        expectedFileNamesByStyle: Map<String, Set<String>>,
    ) {
        styleDirectories.forEach { styleDirectory ->
            val targetDir = baseOutputDir.resolve(styleDirectory)
            if (!targetDir.isDirectory) {
                return@forEach
            }

            val expectedFiles = expectedFileNamesByStyle[styleDirectory].orEmpty()
            targetDir.listFiles { file ->
                file.isFile &&
                    file.extension.equals("kt", ignoreCase = true) &&
                    file.name !in expectedFiles
            }?.forEach { staleFile ->
                staleFile.delete()
            }
        }
    }
}

