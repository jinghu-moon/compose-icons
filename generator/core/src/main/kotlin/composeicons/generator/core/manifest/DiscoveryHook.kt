package composeicons.generator.core.manifest

import composeicons.generator.core.*
import java.io.File

fun interface DiscoveryHook {
    fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry>
}

/** 过滤 alias SVG（Tabler aliases.json 场景）。 */
class AliasFilterHook(private val aliases: Set<String>) : DiscoveryHook {
    override fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry> =
        entries.filter { it.effectiveRawFileName !in aliases }
}

/** 用外部元数据富化每个 entry。key 为 fileName.removeSuffix(".svg")。 */
class MetadataEnricherHook(
    private val metadataBy: Map<String, SvgMetadata>,
) : DiscoveryHook {
    override fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry> =
        entries.map { entry ->
            val key = entry.fileName.removeSuffix(".svg")
            entry.copy(metadata = metadataBy[key] ?: SvgMetadata.EMPTY)
        }
}

/**
 * 解析 Windows git 下的符号链接文件。
 *
 * Windows 上 `git clone` 默认不创建真正的 symlink，而是将符号链接存为
 * 包含目标文件名的文本文件（如 `uk.svg` 内容为 `gb.svg`）。
 * 此 hook 检测此类文件并将其替换为指向实际 SVG 的 SvgIconEntry。
 *
 * 检测逻辑：文件内容不含 `<svg` 且大小 < 1024 字节时视为符号链接。
 * 目标文件名相对于同一目录解析。
 *
 * 解析后自动按目标文件去重，避免 symlink 和 target 同时存在导致 name collision。
 */
class SymlinkResolverHook : DiscoveryHook {
    override fun transform(entries: List<SvgIconEntry>): List<SvgIconEntry> {
        val resolved = entries.mapNotNull { entry ->
            val file = entry.file
            if (!file.exists()) return@mapNotNull null

            val content = file.readText().trim()
            if (content.contains("<svg", ignoreCase = true)) {
                // 正常 SVG 文件，保留
                entry
            } else if (content.length < 1024) {
                // 可能是符号链接文本文件，尝试解析目标
                val targetName = content.removeSuffix("\n").removeSuffix("\r")
                val targetFile = file.parentFile.resolve(targetName)
                if (targetFile.exists() && targetFile.readText().contains("<svg", ignoreCase = true)) {
                    entry.copy(
                        file = targetFile,
                        fileName = targetFile.name,
                        rawFileName = targetFile.name,
                    )
                } else {
                    System.err.println("[SymlinkResolverHook] Cannot resolve symlink: ${file.name} -> $targetName")
                    null
                }
            } else {
                // 非 SVG 且非符号链接，跳过
                null
            }
        }
        // 按目标文件路径去重：同一目标只保留第一个引用（symlink 或原文件）
        val seen = mutableSetOf<String>()
        return resolved.filter { entry ->
            seen.add(entry.file.absolutePath)
        }
    }
}
