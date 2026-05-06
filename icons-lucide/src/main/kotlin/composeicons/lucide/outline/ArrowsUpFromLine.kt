package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowsUpFromLine: ImageVector
    get() {
        if (_arrowsUpFromLine != null) return _arrowsUpFromLine!!
        _arrowsUpFromLine = lucideOutlineIcon(
            name = "ArrowsUpFromLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6 7 3l3 3")
            addPathData("M7 17v-14")
            addPathData("M14 6 17 3l3 3")
            addPathData("M17 17v-14")
            addPathData("M4 21h16")
        }
        return _arrowsUpFromLine!!
    }

private var _arrowsUpFromLine: ImageVector? = null
