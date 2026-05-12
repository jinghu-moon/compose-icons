package composeicons.generator.core.manifest

import composeicons.generator.core.*
import java.io.File

sealed interface DiscoveryStrategy {
    fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry>
    fun resolvedSourceDir(referRoot: File): File

    /** 扁平目录，单 style，所有 SVG 归属同一 style。适用：Lucide / Radix */
    data class Flat(val subdir: String) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            require(styles.size == 1) {
                "Flat discovery requires exactly 1 style, got ${styles.size}"
            }
            return resolvedSourceDir(referRoot).listSvgFiles().map { file ->
                SvgIconEntry(fileName = file.name, style = styles[0].toIconStyle(), file = file, rawFileName = file.name)
            }
        }
    }

    /** 每 style 一个子目录。子目录名由 style.sourcePath（回退 style.subdirectory）决定。适用：Tabler / Iconoir / Heroicons / Boxicons */
    data class Subdirectories(val subdir: String) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            val iconsDir = resolvedSourceDir(referRoot)
            return styles.flatMap { style ->
                val styleSubdir = style.sourcePath ?: style.subdirectory
                    ?: error("Subdirectories discovery requires style.subdirectory or style.sourcePath for '${style.name}'")
                iconsDir.resolve(styleSubdir).listSvgFiles().map { file ->
                    SvgIconEntry(fileName = file.name, style = style.toIconStyle(), file = file, rawFileName = file.name)
                }
            }
        }
    }

    /**
     * 扁平目录，文件名后缀决定 style。匹配命中时后缀被剥离。适用：Phosphor / Bootstrap / Ionicons
     *
     * rules 按声明顺序评估，先命中即返回。Default 应放最后。
     */
    data class SuffixBased(val subdir: String, val rules: List<Rule>) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            return resolvedSourceDir(referRoot).listSvgFiles().mapNotNull { file ->
                classifyBySuffix(file, styles, rules)
            }
        }

        sealed interface Rule {
            data class Match(val style: String, val suffix: String) : Rule
            data class Exclude(val suffix: String) : Rule
            data class Default(val style: String) : Rule
        }
    }

    /** 递归树遍历，匹配规则同 [SuffixBased]。适用：Remix */
    data class TreeWalk(val subdir: String, val rules: List<SuffixBased.Rule>) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            return resolvedSourceDir(referRoot).walkTopDown()
                .filter { it.isFile && it.extension.equals("svg", ignoreCase = true) }
                .mapNotNull { file -> classifyBySuffix(file, styles, rules) }
                .sortedBy { it.file.absolutePath }
                .toList()
        }
    }
    /**
     * 扁平目录，文件名前缀决定 style。匹配命中时前缀被剥离。适用：Iconsax
     */
    data class PrefixBased(val subdir: String, val rules: List<SuffixBased.Rule>) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            return resolvedSourceDir(referRoot).listSvgFiles().mapNotNull { file ->
                classifyByPrefix(file, styles, rules)
            }
        }
    }

    /** 自定义发现逻辑。适用：Octicons */
    class Custom(val subdir: String, val block: (File) -> List<SvgIconEntry>) : DiscoveryStrategy {
        override fun resolvedSourceDir(referRoot: File) = referRoot.resolve(subdir)
        override fun discover(referRoot: File, styles: List<StyleDeclaration>): List<SvgIconEntry> {
            require(styles.isNotEmpty()) { "Styles must be defined before custom discovery logic is executed" }
            return block(resolvedSourceDir(referRoot))
        }
    }
}

// internal helper
private fun classifyBySuffix(
    file: File,
    styles: List<StyleDeclaration>,
    rules: List<DiscoveryStrategy.SuffixBased.Rule>,
): SvgIconEntry? {
    val name = file.nameWithoutExtension
    for (rule in rules) {
        when (rule) {
            is DiscoveryStrategy.SuffixBased.Rule.Match -> if (name.endsWith(rule.suffix)) {
                val style = styles.find { it.name == rule.style }
                    ?: error("Unknown style '${rule.style}' in discovery rule")
                val strippedName = "${name.removeSuffix(rule.suffix)}.svg"
                return SvgIconEntry(fileName = strippedName, style = style.toIconStyle(), file = file, rawFileName = file.name)
            }
            is DiscoveryStrategy.SuffixBased.Rule.Exclude -> if (name.endsWith(rule.suffix)) {
                return null
            }
            is DiscoveryStrategy.SuffixBased.Rule.Default -> {
                val style = styles.find { it.name == rule.style }
                    ?: error("Unknown style '${rule.style}' in discovery rule")
                return SvgIconEntry(fileName = file.name, style = style.toIconStyle(), file = file, rawFileName = file.name)
            }
        }
    }
    return null
}

private fun classifyByPrefix(
    file: File,
    styles: List<StyleDeclaration>,
    rules: List<DiscoveryStrategy.SuffixBased.Rule>,
): SvgIconEntry? {
    val name = file.nameWithoutExtension
    for (rule in rules) {
        when (rule) {
            is DiscoveryStrategy.SuffixBased.Rule.Match -> if (name.startsWith(rule.suffix)) {
                val style = styles.find { it.name == rule.style }
                    ?: error("Unknown style '${rule.style}' in discovery rule")
                val strippedName = "${name.removePrefix(rule.suffix)}.svg"
                return SvgIconEntry(fileName = strippedName, style = style.toIconStyle(), file = file, rawFileName = file.name)
            }
            is DiscoveryStrategy.SuffixBased.Rule.Exclude -> if (name.startsWith(rule.suffix)) {
                return null
            }
            is DiscoveryStrategy.SuffixBased.Rule.Default -> {
                val style = styles.find { it.name == rule.style }
                    ?: error("Unknown style '${rule.style}' in discovery rule")
                return SvgIconEntry(fileName = file.name, style = style.toIconStyle(), file = file, rawFileName = file.name)
            }
        }
    }
    return null
}

// Extension to List SVG files
internal fun File.listSvgFiles(): List<File> {
    return listFiles { f -> f.isFile && f.extension.equals("svg", ignoreCase = true) }?.toList().orEmpty().sortedBy { it.name }
}
