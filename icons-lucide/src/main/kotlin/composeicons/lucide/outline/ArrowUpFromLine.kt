package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUpFromLine: ImageVector
    get() {
        if (_arrowUpFromLine != null) return _arrowUpFromLine!!
        _arrowUpFromLine = lucideOutlineIcon(
            name = "ArrowUpFromLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 9 12 3 6 9")
            addPathData("M12 3v14")
            addPathData("M5 21h14")
        }
        return _arrowUpFromLine!!
    }

private var _arrowUpFromLine: ImageVector? = null
