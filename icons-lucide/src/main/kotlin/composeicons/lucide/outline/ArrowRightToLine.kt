package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowRightToLine: ImageVector
    get() {
        if (_arrowRightToLine != null) return _arrowRightToLine!!
        _arrowRightToLine = lucideOutlineIcon(
            name = "ArrowRightToLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12h-14")
            addPathData("M11 18l6-6L11 6")
            addPathData("M21 5v14")
        }
        return _arrowRightToLine!!
    }

private var _arrowRightToLine: ImageVector? = null
