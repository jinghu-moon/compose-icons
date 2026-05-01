package composeicons.generator.core

object IconNameMapper {

    fun toKotlinName(svgFileName: String): String {
        val baseName = svgFileName.removeSuffix(".svg")
        val pascal = baseName.split("-")
            .filter { it.isNotBlank() }
            .joinToString(separator = "") { segment ->
                segment.toPascalSegment()
            }

        return if (pascal.firstOrNull()?.isDigit() == true) "_$pascal" else pascal
    }
}

private fun String.toPascalSegment(): String {
    val leadingDigits = takeWhile(Char::isDigit)
    val remainder = dropWhile(Char::isDigit)
    if (leadingDigits.isNotEmpty()) {
        return leadingDigits + remainder.replaceFirstChar { char -> char.uppercaseChar() }
    }
    return replaceFirstChar { char -> char.uppercaseChar() }
}
