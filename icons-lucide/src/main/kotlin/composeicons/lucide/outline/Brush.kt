package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Brush: ImageVector
    get() {
        if (_brush != null) return _brush!!
        _brush = lucideOutlineIcon(
            name = "Brush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 10l3 3")
            addPathData("M6.5 21C8.433 21 10 19.433 10 17.5 10 15.567 8.433 14 6.5 14 4.567 14 3 15.567 3 17.5c0 .666-.253 1.306-.708 1.792-.287 .286-.373 .717-.218 1.091 .155 .374 .521 .618 .926 .617Z")
            addPathData("M9.969 17.031 21.378 5.624c.829-.829 .829-2.173 0-3.002-.829-.829-2.173-.829-3.002 0L6.967 14.031")
        }
        return _brush!!
    }

private var _brush: ImageVector? = null
