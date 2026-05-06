package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDownToLine: ImageVector
    get() {
        if (_arrowDownToLine != null) return _arrowDownToLine!!
        _arrowDownToLine = lucideOutlineIcon(
            name = "ArrowDownToLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v-14")
            addPathData("M6 11l6 6 6-6")
            addPathData("M19 21h-14")
        }
        return _arrowDownToLine!!
    }

private var _arrowDownToLine: ImageVector? = null
