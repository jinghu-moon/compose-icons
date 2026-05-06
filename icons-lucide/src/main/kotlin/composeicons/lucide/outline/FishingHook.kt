package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FishingHook: ImageVector
    get() {
        if (_fishingHook != null) return _fishingHook!!
        _fishingHook = lucideOutlineIcon(
            name = "FishingHook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.586 11.414l-5.93 5.93c-2.209 2.209-5.791 2.209-8 0C1.447 15.135 1.447 11.553 3.656 9.344L6.793 6.207c.202-.202 .506-.263 .771-.153 .264 .109 .436 .367 .436 .653v3.293")
            addPathData("M20.414 8.586 22 7")
            addPathData("M21 10c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _fishingHook!!
    }

private var _fishingHook: ImageVector? = null
