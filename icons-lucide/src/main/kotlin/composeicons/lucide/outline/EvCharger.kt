package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EvCharger: ImageVector
    get() {
        if (_evCharger != null) return _evCharger!!
        _evCharger = lucideOutlineIcon(
            name = "EvCharger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 13h2c1.105 0 2 .895 2 2v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-6.998c0-.533-.212-1.044-.59-1.42L18 5")
            addPathData("M14 21v-16C14 3.895 13.105 3 12 3h-7C3.895 3 3 3.895 3 5v16")
            addPathData("M2 21h13")
            addPathData("M3 7h11")
            addPathData("M9 11 7 14h3L8 17")
        }
        return _evCharger!!
    }

private var _evCharger: ImageVector? = null
