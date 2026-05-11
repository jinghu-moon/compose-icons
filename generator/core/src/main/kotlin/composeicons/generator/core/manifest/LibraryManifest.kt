package composeicons.generator.core.manifest

import composeicons.generator.core.*
import java.io.File

/**
 * 声明式 IconSource 的数据模型。
 *
 * 通过 [iconLibrary] DSL 构造，包装当前 10 个库散落在各 IconSource 实现里的
 * 数据声明 + discovery 逻辑，使新增图标库从 ~80 行代码降到 ~25 行 DSL。
 *
 * 不改变 [IconSource] 接口契约。[ManifestBasedIconSource] 包装此数据类，
 * 对外仍是合法的 [IconSource] 实例。
 */
data class LibraryManifest(
    val name: String,
    val displayName: String,
    val iconContainerName: String,
    val upstreamVersion: String,
    val basePackage: String,
    val styles: List<StyleDeclaration>,
    val discovery: DiscoveryStrategy,
    val hooks: List<DiscoveryHook> = emptyList(),
)

data class StyleDeclaration(
    val name: String,
    /** 相对 [DiscoveryStrategy] 根目录的子路径；Flat 策略下可为 null。 */
    val subdirectory: String?,
    /** SVG 发现路径，默认回退到 [subdirectory]。当上游目录名不是合法 Kotlin 标识符时需显式设置。 */
    val sourcePath: String?,
    val helperFunction: String,
    val defaultPathStyle: PathStyle,
)

fun StyleDeclaration.toIconStyle() = IconStyle(name, subdirectory.orEmpty())
