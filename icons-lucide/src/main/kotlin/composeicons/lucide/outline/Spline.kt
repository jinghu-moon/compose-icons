package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spline: ImageVector
    get() {
        if (_spline != null) return _spline!!
        _spline = lucideOutlineIcon(
            name = "Spline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5c0 1.105-.895 2-2 2C17.895 7 17 6.105 17 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M7 19c0 1.105-.895 2-2 2C3.895 21 3 20.105 3 19c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M5 17C5 10.373 10.373 5 17 5")
        }
        return _spline!!
    }

private var _spline: ImageVector? = null
