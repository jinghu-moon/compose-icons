package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Scale3D: ImageVector
    get() {
        if (_scale3D != null) return _scale3D!!
        _scale3D = lucideOutlineIcon(
            name = "Scale3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7v11c0 .552 .448 1 1 1h11")
            addPathData("M5.293 18.707 11 13")
            addPathData("M21 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M7 5C7 6.105 6.105 7 5 7 3.895 7 3 6.105 3 5 3 3.895 3.895 3 5 3c1.105 0 2 .895 2 2Z")
        }
        return _scale3D!!
    }

private var _scale3D: ImageVector? = null
