package composeicons.generator.tabler

import composeicons.generator.core.IconStyle
import java.io.File

class TablerAliasRegistry private constructor(
    private val aliasesByStyle: Map<String, Map<String, String>>,
) {

    fun canonicalFileName(style: IconStyle, fileName: String): String {
        val normalized = fileName.removeSuffix(".svg")
        val canonical = aliasesByStyle[style.subdirectory]
            ?.get(normalized)
            ?: normalized
        return "$canonical.svg"
    }

    fun aliasesFor(style: IconStyle, canonicalFileName: String): Set<String> {
        val normalized = canonicalFileName.removeSuffix(".svg")
        return aliasesByStyle[style.subdirectory]
            ?.filterValues { canonical -> canonical == normalized }
            ?.keys
            ?.map { alias -> "$alias.svg" }
            ?.toSet()
            .orEmpty()
    }

    fun aliasesByStyle(style: IconStyle): Map<String, String> {
        return aliasesByStyle[style.subdirectory].orEmpty()
    }

    fun allAliases(): Set<String> {
        return aliasesByStyle.values.flatMap { it.keys }.map { "$it.svg" }.toSet()
    }

    companion object {
        fun load(referRoot: File): TablerAliasRegistry {
            val aliasesFile = referRoot.resolve("aliases.json")
            if (!aliasesFile.isFile) {
                return TablerAliasRegistry(emptyMap())
            }

            val content = aliasesFile.readText()
            val styles = listOf("outline", "filled")
            val aliases = styles.associateWith { styleName ->
                parseStyleAliases(content, styleName)
            }
            return TablerAliasRegistry(aliases)
        }

        private fun parseStyleAliases(content: String, styleName: String): Map<String, String> {
            val styleBlock = Regex(
                """"$styleName"\s*:\s*\{(.*?)\}""",
                setOf(RegexOption.DOT_MATCHES_ALL),
            ).find(content)?.groupValues?.getOrNull(1).orEmpty()

            return Regex(""""([^"]+)"\s*:\s*"([^"]+)"""")
                .findAll(styleBlock)
                .associate { match ->
                    val alias = match.groupValues[1]
                    val canonical = match.groupValues[2]
                    alias to canonical
                }
        }
    }
}
