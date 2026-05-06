package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = lucideOutlineIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14.899C1.965 12.82 1.428 9.699 2.652 7.059 3.875 4.419 6.604 2.812 9.506 3.021c2.902 .209 5.372 2.191 6.204 4.979h1.79c1.982-0 3.731 1.297 4.307 3.194 .575 1.897-.158 3.947-1.807 5.048")
            addPathData("M8 15h.01")
            addPathData("M8 19h.01")
            addPathData("M12 17h.01")
            addPathData("M12 21h.01")
            addPathData("M16 15h.01")
            addPathData("M16 19h.01")
        }
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
