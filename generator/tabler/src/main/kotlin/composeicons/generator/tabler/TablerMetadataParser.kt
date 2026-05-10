package composeicons.generator.tabler

import composeicons.generator.core.SvgIconEntry
import composeicons.generator.core.SvgMetadata

object TablerMetadataParser {
    private val TAGS_REGEX = Regex("tags:\\s*\\[(.*?)\\]")
    private val CATEGORY_REGEX = Regex("category:\\s*(.*?)\\s*\\n")

    /**
     * 批量解析 Tabler SVG 内容中的 tags 和 category 元数据。
     * 目前为串行处理，后续可根据性能需求优化。
     */
    fun enrich(entries: List<SvgIconEntry>): List<SvgIconEntry> {
        return entries.map { entry ->
            val content = entry.file.readText()
            val tags = TAGS_REGEX.find(content)?.groupValues?.get(1)
                ?.split(",")?.map { it.trim() }?.filter { it.isNotEmpty() }?.toSet().orEmpty()
            val category = CATEGORY_REGEX.find(content)?.groupValues?.get(1)?.trim()
            
            entry.copy(metadata = SvgMetadata(tags, category, null, null))
        }
    }
}
