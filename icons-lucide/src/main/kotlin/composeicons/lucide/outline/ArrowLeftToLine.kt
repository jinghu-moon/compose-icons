package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowLeftToLine: ImageVector
    get() {
        if (_arrowLeftToLine != null) return _arrowLeftToLine!!
        _arrowLeftToLine = lucideOutlineIcon(
            name = "ArrowLeftToLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19v-14")
            addPathData("M13 6 7 12l6 6")
            addPathData("M7 12h14")
        }
        return _arrowLeftToLine!!
    }

private var _arrowLeftToLine: ImageVector? = null
