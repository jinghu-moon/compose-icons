package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScissorsLineDashed: ImageVector
    get() {
        if (_scissorsLineDashed != null) return _scissorsLineDashed!!
        _scissorsLineDashed = lucideOutlineIcon(
            name = "ScissorsLineDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.42 9.42 8 12")
            addPathData("M6 8c0 1.105-.895 2-2 2C2.895 10 2 9.105 2 8 2 6.895 2.895 6 4 6c1.105 0 2 .895 2 2Z")
            addPathData("M14 6 5.42 14.58")
            addPathData("M6 16c0 1.105-.895 2-2 2C2.895 18 2 17.105 2 16c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M10.8 14.8 14 18")
            addPathData("M16 12h-2")
            addPathData("M22 12h-2")
        }
        return _scissorsLineDashed!!
    }

private var _scissorsLineDashed: ImageVector? = null
