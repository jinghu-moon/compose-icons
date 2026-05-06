package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacScorpio: ImageVector
    get() {
        if (_zodiacScorpio != null) return _zodiacScorpio!!
        _zodiacScorpio = lucideOutlineIcon(
            name = "ZodiacScorpio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 19v-13.5C10 4.119 11.119 3 12.5 3 13.881 3 15 4.119 15 5.5v11.5c0 1.105 .895 2 2 2h5L19 16")
            addPathData("M22 19l-3 3")
            addPathData("M5 19v-13.5C5 4.119 6.119 3 7.5 3 8.881 3 10 4.119 10 5.5")
            addPathData("M5 5.5C5 4.119 3.881 3 2.5 3")
        }
        return _zodiacScorpio!!
    }

private var _zodiacScorpio: ImageVector? = null
