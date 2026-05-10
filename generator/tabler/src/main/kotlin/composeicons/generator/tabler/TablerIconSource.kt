package composeicons.generator.tabler

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun TablerIconSource(
    upstreamVersion: String = "3.41.1",
    referRoot: File,
): IconSource = iconLibrary(referRoot) {
    name = "tabler"
    displayName = "TablerIcons"
    iconContainerName = "TablerIcons"
    basePackage = "composeicons.tabler"
    this.upstreamVersion = upstreamVersion

    style("Outline") {
        subdirectory = "outline"
        helperFunction = "tablerOutlineIcon"
        defaultPathStyle {
            fill = "none"; stroke = "currentColor"; strokeWidth = 2f
            strokeLineCap = "round"; strokeLineJoin = "round"
        }
    }
    style("Filled") {
        subdirectory = "filled"
        helperFunction = "tablerFilledIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = subdirectories("icons")

    // Hook 1: 过滤 Alias (遵循审计报告 #11 / 默认开启)
    val aliasRegistry = TablerAliasRegistry.load(referRoot)
    hook(AliasFilterHook(aliasRegistry.allAliases()))

    // Hook 2: 解析元数据 (已优化，遵循审计报告 #6)
    hook { entries -> TablerMetadataParser.enrich(entries) }
}
