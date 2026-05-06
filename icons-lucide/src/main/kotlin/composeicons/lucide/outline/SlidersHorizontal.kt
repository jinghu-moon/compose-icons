package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = lucideOutlineIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5h-7")
            addPathData("M12 19h-9")
            addPathData("M14 3v4")
            addPathData("M16 17v4")
            addPathData("M21 12h-9")
            addPathData("M21 19h-5")
            addPathData("M21 5h-7")
            addPathData("M8 10v4")
            addPathData("M8 12h-5")
        }
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
