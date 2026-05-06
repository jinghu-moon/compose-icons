package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Axis3D: ImageVector
    get() {
        if (_axis3D != null) return _axis3D!!
        _axis3D = lucideOutlineIcon(
            name = "Axis3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 10.5 15 9")
            addPathData("M4 4v15c0 .552 .448 1 1 1h15")
            addPathData("M4.293 19.707 6 18")
            addPathData("M9 15l1.5-1.5")
        }
        return _axis3D!!
    }

private var _axis3D: ImageVector? = null
