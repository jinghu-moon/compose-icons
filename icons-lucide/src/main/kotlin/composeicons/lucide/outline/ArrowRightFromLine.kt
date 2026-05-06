package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowRightFromLine: ImageVector
    get() {
        if (_arrowRightFromLine != null) return _arrowRightFromLine!!
        _arrowRightFromLine = lucideOutlineIcon(
            name = "ArrowRightFromLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5v14")
            addPathData("M21 12h-14")
            addPathData("M15 18l6-6L15 6")
        }
        return _arrowRightFromLine!!
    }

private var _arrowRightFromLine: ImageVector? = null
