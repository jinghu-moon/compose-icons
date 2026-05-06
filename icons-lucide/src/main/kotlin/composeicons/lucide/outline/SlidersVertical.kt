package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SlidersVertical: ImageVector
    get() {
        if (_slidersVertical != null) return _slidersVertical!!
        _slidersVertical = lucideOutlineIcon(
            name = "SlidersVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8h4")
            addPathData("M12 21v-9")
            addPathData("M12 8v-5")
            addPathData("M17 16h4")
            addPathData("M19 12v-9")
            addPathData("M19 21v-5")
            addPathData("M3 14h4")
            addPathData("M5 10v-7")
            addPathData("M5 21v-7")
        }
        return _slidersVertical!!
    }

private var _slidersVertical: ImageVector? = null
