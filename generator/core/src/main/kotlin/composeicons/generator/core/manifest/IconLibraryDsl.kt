package composeicons.generator.core.manifest

import composeicons.generator.core.*
import java.io.File

@DslMarker annotation class IconLibraryDslMarker

fun iconLibrary(
    referRoot: File,
    block: LibraryManifestBuilder.() -> Unit,
): IconSource {
    val builder = LibraryManifestBuilder()
    builder.block()
    return ManifestBasedIconSource(builder.build(), referRoot)
}

@IconLibraryDslMarker
class LibraryManifestBuilder {
    var name: String = ""
    var displayName: String = ""
    var iconContainerName: String = ""
    var upstreamVersion: String = ""
    var basePackage: String = ""

    private val styles = mutableListOf<StyleDeclaration>()
    private val hooks = mutableListOf<DiscoveryHook>()
    var discovery: DiscoveryStrategy? = null

    fun style(name: String, block: StyleBuilder.() -> Unit) {
        styles.add(StyleBuilder(name).apply(block).build())
    }

    fun hook(hook: DiscoveryHook) { hooks.add(hook) }
    fun hook(transform: (List<SvgIconEntry>) -> List<SvgIconEntry>) { hooks.add(DiscoveryHook(transform)) }

    fun build() = LibraryManifest(
        name = name.ifBlank { error("name required") },
        displayName = displayName.ifBlank { error("displayName required") },
        iconContainerName = iconContainerName.ifBlank { error("iconContainerName required") },
        upstreamVersion = upstreamVersion.ifBlank { error("upstreamVersion required") },
        basePackage = basePackage.ifBlank { error("basePackage required") },
        styles = styles.toList(),
        discovery = discovery ?: error("discovery required"),
        hooks = hooks.toList(),
    )
}

@IconLibraryDslMarker
class StyleBuilder(private val styleName: String) {
    var subdirectory: String? = null
    var helperFunction: String = ""
    private var defaultPathStyle: PathStyle? = null

    fun defaultPathStyle(block: PathStyleBuilder.() -> Unit) {
        defaultPathStyle = PathStyleBuilder().apply(block).build()
    }

    fun build() = StyleDeclaration(
        name = styleName,
        subdirectory = subdirectory,
        helperFunction = helperFunction.ifBlank { error("helperFunction required for style '$styleName'") },
        defaultPathStyle = defaultPathStyle ?: error("defaultPathStyle required for style '$styleName'"),
    )
}

@IconLibraryDslMarker
class PathStyleBuilder {
    var fill: String? = null
    var stroke: String? = null
    var strokeWidth: Float? = null
    var strokeLineCap: String? = null
    var strokeLineJoin: String? = null
    var fillRule: String? = null
    var alpha: Float = 1.0f

    fun build(): PathStyle {
        if (strokeWidth != null && stroke == null) {
            System.err.println("Warning: strokeWidth ($strokeWidth) set without stroke color in DSL")
        }
        return PathStyle(fill, stroke, strokeWidth, strokeLineCap, strokeLineJoin, fillRule, alpha)
    }
}

// DiscoveryStrategy 构造器辅助函数
fun flat(subdir: String) = DiscoveryStrategy.Flat(subdir)
fun subdirectories(subdir: String) = DiscoveryStrategy.Subdirectories(subdir)
fun suffixBased(subdir: String, block: SuffixRulesBuilder.() -> Unit) =
    DiscoveryStrategy.SuffixBased(subdir, SuffixRulesBuilder().apply(block).build())
fun treeWalk(subdir: String, block: SuffixRulesBuilder.() -> Unit) =
    DiscoveryStrategy.TreeWalk(subdir, SuffixRulesBuilder().apply(block).build())

@IconLibraryDslMarker
class SuffixRulesBuilder {
    private val rules = mutableListOf<DiscoveryStrategy.SuffixBased.Rule>()
    fun match(style: String, suffix: String) { rules.add(DiscoveryStrategy.SuffixBased.Rule.Match(style, suffix)) }
    fun exclude(suffix: String) { rules.add(DiscoveryStrategy.SuffixBased.Rule.Exclude(suffix)) }
    fun default(style: String) { rules.add(DiscoveryStrategy.SuffixBased.Rule.Default(style)) }
    internal fun build(): List<DiscoveryStrategy.SuffixBased.Rule> {
        val list = rules.toList()
        val defaultIdx = list.indexOfFirst { it is DiscoveryStrategy.SuffixBased.Rule.Default }
        if (defaultIdx >= 0 && defaultIdx != list.lastIndex) {
            error("Default rule must be the last rule in SuffixBased strategy, but it's at index $defaultIdx")
        }
        return list
    }
}
