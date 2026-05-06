package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pilcrow: ImageVector
    get() {
        if (_pilcrow != null) return _pilcrow!!
        _pilcrow = lucideOutlineIcon(
            name = "Pilcrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 4v16")
            addPathData("M17 4v16")
            addPathData("M19 4h-9.5C7.015 4 5 6.015 5 8.5 5 10.985 7.015 13 9.5 13h3.5")
        }
        return _pilcrow!!
    }

private var _pilcrow: ImageVector? = null
