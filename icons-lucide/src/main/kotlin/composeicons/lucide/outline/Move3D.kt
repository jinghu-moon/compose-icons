package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Move3D: ImageVector
    get() {
        if (_move3D != null) return _move3D!!
        _move3D = lucideOutlineIcon(
            name = "Move3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3v16h16")
            addPathData("M5 19l6-6")
            addPathData("M2 6 5 3 8 6")
            addPathData("M18 16l3 3-3 3")
        }
        return _move3D!!
    }

private var _move3D: ImageVector? = null
