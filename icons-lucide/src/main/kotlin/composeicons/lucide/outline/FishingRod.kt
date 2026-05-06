package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FishingRod: ImageVector
    get() {
        if (_fishingRod != null) return _fishingRod!!
        _fishingRod = lucideOutlineIcon(
            name = "FishingRod",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11h1")
            addPathData("M8 15c0 1.105-.895 2-2 2C4.895 17 4 16.105 4 15v-12C4 2.448 4.448 2 5 2h.5C14 2 20 9 20 18v4")
            addPathData("M20 18c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _fishingRod!!
    }

private var _fishingRod: ImageVector? = null
