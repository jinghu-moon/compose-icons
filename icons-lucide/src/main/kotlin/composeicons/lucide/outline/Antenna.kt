package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Antenna: ImageVector
    get() {
        if (_antenna != null) return _antenna!!
        _antenna = lucideOutlineIcon(
            name = "Antenna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12 7 2")
            addPathData("M7 12 12 2")
            addPathData("M12 12 17 2")
            addPathData("M17 12 22 2")
            addPathData("M4.5 7h15")
            addPathData("M12 16v6")
        }
        return _antenna!!
    }

private var _antenna: ImageVector? = null
