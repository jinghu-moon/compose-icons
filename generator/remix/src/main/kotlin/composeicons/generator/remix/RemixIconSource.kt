package composeicons.generator.remix

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun RemixIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "remixicons"
    displayName = "Remix Icon"
    iconContainerName = "RemixIcons"
    basePackage = "composeicons.remix"
    upstreamVersion = "4.2.0"

    style("Fill") {
        helperFunction = "remixIcon"
        defaultPathStyle { fill = "currentColor"; fillRule = "nonzero" }
    }
    style("Line") {
        helperFunction = "remixIcon"
        defaultPathStyle { fill = "currentColor"; fillRule = "nonzero" }
    }

    discovery = treeWalk("icons") {
        match("Fill", "-fill")
        match("Line", "-line")
    }

    // Hook: 使用内置 MetadataEnricherHook 与独立 Parser (遵循审计报告 #11 / C 项)
    val tagsFile = referRoot.resolve("tags.json")
    if (tagsFile.exists()) {
        hook(MetadataEnricherHook(RemixMetadataParser.load(tagsFile)))
    }
}
