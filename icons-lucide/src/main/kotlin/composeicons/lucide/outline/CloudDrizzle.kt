package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudDrizzle: ImageVector
    get() {
        if (_cloudDrizzle != null) return _cloudDrizzle!!
        _cloudDrizzle = lucideOutlineIcon(
            name = "CloudDrizzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14.899C1.965 12.82 1.428 9.699 2.652 7.059 3.875 4.419 6.604 2.812 9.506 3.021c2.902 .209 5.372 2.191 6.204 4.979h1.79c1.982-0 3.731 1.297 4.307 3.194 .575 1.897-.158 3.947-1.807 5.048")
            addPathData("M8 19v1")
            addPathData("M8 14v1")
            addPathData("M16 19v1")
            addPathData("M16 14v1")
            addPathData("M12 21v1")
            addPathData("M12 16v1")
        }
        return _cloudDrizzle!!
    }

private var _cloudDrizzle: ImageVector? = null
