package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sunrise: ImageVector
    get() {
        if (_sunrise != null) return _sunrise!!
        _sunrise = lucideOutlineIcon(
            name = "Sunrise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v8")
            addPathData("M4.93 10.93l1.41 1.41")
            addPathData("M2 18h2")
            addPathData("M20 18h2")
            addPathData("M19.07 10.93l-1.41 1.41")
            addPathData("M22 22h-20")
            addPathData("M8 6 12 2l4 4")
            addPathData("M16 18c0-2.209-1.791-4-4-4C9.791 14 8 15.791 8 18")
        }
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
