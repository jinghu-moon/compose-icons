package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = lucideOutlineIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 14 17 11")
            addPathData("M3 9l6 2C9 9.895 9.895 9 11 9h2c1.031 0 1.892 .784 1.99 1.81")
            addPathData("M8 17h3c.552 0 1-.448 1-1 0-3.314 2.686-6 6-6 .552 0 1-.448 1-1v-.75C18.789 6.945 18.07 5.776 17 5")
            addPathData("M22 17c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M8 17c0 1.657-1.343 3-3 3C3.343 20 2 18.657 2 17 2 15.343 3.343 14 5 14c1.657 0 3 1.343 3 3Z")
        }
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
