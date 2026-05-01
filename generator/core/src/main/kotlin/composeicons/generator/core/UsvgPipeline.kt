package composeicons.generator.core

import java.io.File
import java.util.concurrent.TimeUnit

class UsvgPipeline(
    private val usvgExecutable: File,
) {
    /**
     * Runs usvg to flatten the SVG and returns the optimized SVG string.
     * Throws an exception if usvg fails.
     */
    fun flatten(rawSvg: String): String {
        val process = ProcessBuilder(
            usvgExecutable.absolutePath,
            "-", // Read from stdin
            "-c", // Output to stdout
            "--indent", "none",
            "--coordinates-precision", "6"
        )
            .redirectError(ProcessBuilder.Redirect.PIPE)
            .start()

        process.outputStream.bufferedWriter().use { writer ->
            writer.write(rawSvg)
        }

        val output = process.inputStream.bufferedReader().use { it.readText() }
        val errorOutput = process.errorStream.bufferedReader().use { it.readText() }

        val exitCode = process.waitFor()
        if (exitCode != 0) {
            throw RuntimeException("usvg failed with exit code $exitCode: $errorOutput")
        }

        return output
    }
}
