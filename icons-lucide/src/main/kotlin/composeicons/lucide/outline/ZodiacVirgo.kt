package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacVirgo: ImageVector
    get() {
        if (_zodiacVirgo != null) return _zodiacVirgo!!
        _zodiacVirgo = lucideOutlineIcon(
            name = "ZodiacVirgo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5.5C11 4.119 12.119 3 13.5 3 14.881 3 16 4.119 16 5.5v10.5c0 2.761 2.239 5 5 5")
            addPathData("M16 11.5C16 10.119 17.119 9 18.5 9 19.881 9 21 10.119 21 11.5v4.5c0 2.761-2.239 5-5 5")
            addPathData("M6 19v-13C6 4.343 4.657 3 3 3h0")
            addPathData("M6 5.5C6 4.119 7.119 3 8.5 3 9.881 3 11 4.119 11 5.5v13.5")
        }
        return _zodiacVirgo!!
    }

private var _zodiacVirgo: ImageVector? = null
