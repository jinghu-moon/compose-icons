package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Blinds: ImageVector
    get() {
        if (_blinds != null) return _blinds!!
        _blinds = lucideOutlineIcon(
            name = "Blinds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3h18")
            addPathData("M20 7h-12")
            addPathData("M20 11h-12")
            addPathData("M10 19h10")
            addPathData("M8 15h12")
            addPathData("M4 3v14")
            addPathData("M6 19c0 1.105-.895 2-2 2C2.895 21 2 20.105 2 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _blinds!!
    }

private var _blinds: ImageVector? = null
