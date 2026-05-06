package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tangent: ImageVector
    get() {
        if (_tangent != null) return _tangent!!
        _tangent = lucideOutlineIcon(
            name = "Tangent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 4c0 1.105-.895 2-2 2C15.895 6 15 5.105 15 4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M15.59 5.41 5.41 15.59")
            addPathData("M6 17c0 1.105-.895 2-2 2C2.895 19 2 18.105 2 17c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M12 22C12 22 8 13 10.5 10.5 13 8 22 12 22 12")
        }
        return _tangent!!
    }

private var _tangent: ImageVector? = null
