package composeicons.generator.core

object SvgValidator {

    private val unsupportedTags = setOf(
        "clipPath",
        "mask",
        "filter",
        "pattern",
        "image",
        "text",
    )

    fun validate(documentText: String): List<String> {
        val warnings = mutableListOf<String>()
        unsupportedTags.forEach { tag ->
            if (Regex("<\\s*$tag\\b").containsMatchIn(documentText)) {
                warnings += "Unsupported <$tag> element"
            }
        }
        if (Regex("""\btransform\s*=""").containsMatchIn(documentText)) {
            warnings += "Unsupported transform attribute"
        }
        return warnings
    }
}
