package composeicons.generator.circleflags

import composeicons.generator.core.*
import composeicons.generator.core.manifest.*
import java.io.File

fun CircleFlagsIconSource(referRoot: File): IconSource = iconLibrary(referRoot) {
    name = "circleflags"
    displayName = "Circle Flags"
    iconContainerName = "CircleFlags"
    basePackage = "composeicons.circleflags"
    upstreamVersion = "v2.8.0"

    style("Regular") {
        subdirectory = ""
        helperFunction = "circleFlagsRegularIcon"
        defaultPathStyle { fill = "currentColor" }
    }

    discovery = flat("flags")

    // Windows git 将 symlink 存为文本文件，需要解析目标
    hook(SymlinkResolverHook())
}
