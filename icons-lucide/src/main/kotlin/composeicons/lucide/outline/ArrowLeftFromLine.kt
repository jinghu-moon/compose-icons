package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowLeftFromLine: ImageVector
    get() {
        if (_arrowLeftFromLine != null) return _arrowLeftFromLine!!
        _arrowLeftFromLine = lucideOutlineIcon(
            name = "ArrowLeftFromLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6 3 12l6 6")
            addPathData("M3 12h14")
            addPathData("M21 19v-14")
        }
        return _arrowLeftFromLine!!
    }

private var _arrowLeftFromLine: ImageVector? = null
