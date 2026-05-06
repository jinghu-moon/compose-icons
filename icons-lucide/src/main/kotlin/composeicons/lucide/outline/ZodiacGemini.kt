package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacGemini: ImageVector
    get() {
        if (_zodiacGemini != null) return _zodiacGemini!!
        _zodiacGemini = lucideOutlineIcon(
            name = "ZodiacGemini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4.525v14.948")
            addPathData("M20 3C15 5.667 9 5.667 4 3")
            addPathData("M4 21c5-2.667 11-2.667 16 0")
            addPathData("M8 4.525v14.948")
        }
        return _zodiacGemini!!
    }

private var _zodiacGemini: ImageVector? = null
