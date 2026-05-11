package composeicons.demo

import androidx.compose.ui.graphics.vector.ImageVector

object IconRegistry {
    private val icons: Map<String, ImageVector> by lazy {
        buildMap {
        putAll(registerBootstrapIcons0())
        putAll(registerBootstrapIcons1())
        putAll(registerBoxiconsIcons0())
        putAll(registerBoxiconsIcons1())
        putAll(registerBoxiconsIcons2())
        putAll(registerHeroiconsIcons())
        putAll(registerIconoirIcons0())
        putAll(registerIconoirIcons1())
        putAll(registerIoniconsIcons())
        putAll(registerLucideIcons0())
        putAll(registerLucideIcons1())
        putAll(registerPhosphorIcons0())
        putAll(registerPhosphorIcons1())
        putAll(registerPhosphorIcons2())
        putAll(registerPhosphorIcons3())
        putAll(registerPhosphorIcons4())
        putAll(registerPhosphorIcons5())
        putAll(registerPhosphorIcons6())
        putAll(registerRadixiconsIcons())
        putAll(registerRemixiconsIcons0())
        putAll(registerRemixiconsIcons1())
        putAll(registerTablerIcons0())
        putAll(registerTablerIcons1())
        putAll(registerTablerIcons2())
        putAll(registerTablerIcons3())
        putAll(registerTablerIcons4())
        }
    }

    fun get(kotlinPath: String): ImageVector? = icons[kotlinPath]
    fun allKeys(): Set<String> = icons.keys
    fun size(): Int = icons.size
}