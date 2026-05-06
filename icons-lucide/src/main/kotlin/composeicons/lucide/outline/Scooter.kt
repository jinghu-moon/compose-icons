package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = lucideOutlineIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 4h-3.5l2 11.05")
            addPathData("M6.95 17h5.142c.523 0 .95-.406 1.063-.916 .582-2.61 2.703-4.598 5.345-5.009")
            addPathData("M22 17.5C22 18.881 20.881 20 19.5 20 18.119 20 17 18.881 17 17.5 17 16.119 18.119 15 19.5 15 20.881 15 22 16.119 22 17.5Z")
            addPathData("M7 17.5C7 18.881 5.881 20 4.5 20 3.119 20 2 18.881 2 17.5 2 16.119 3.119 15 4.5 15 5.881 15 7 16.119 7 17.5Z")
        }
        return _scooter!!
    }

private var _scooter: ImageVector? = null
