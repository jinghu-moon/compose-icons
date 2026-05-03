package composeicons.generator.core

object SvgValidator {

    private val unsupportedTags = setOf(
        "filter",
        "pattern",
        "image",
        "text",
    )

    fun validate(documentText: String): List<String> {
        val warnings = mutableListOf<String>()
        unsupportedTags.forEach { tag ->
            if (Regex("<\\s*$tag\\b").containsMatchIn(documentText)) {
                warnings += "Unsupported <$tag> element detected"
            }
        }
        return warnings
    }
}
