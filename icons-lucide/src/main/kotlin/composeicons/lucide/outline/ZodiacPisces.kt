package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacPisces: ImageVector
    get() {
        if (_zodiacPisces != null) return _zodiacPisces!!
        _zodiacPisces = lucideOutlineIcon(
            name = "ZodiacPisces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 21C15 15.667 15 8.333 19 3")
            addPathData("M20 12h-16")
            addPathData("M5 3C9 8.333 9 15.667 5 21")
        }
        return _zodiacPisces!!
    }

private var _zodiacPisces: ImageVector? = null
