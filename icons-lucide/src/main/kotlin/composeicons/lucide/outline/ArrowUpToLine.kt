package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUpToLine: ImageVector
    get() {
        if (_arrowUpToLine != null) return _arrowUpToLine!!
        _arrowUpToLine = lucideOutlineIcon(
            name = "ArrowUpToLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14")
            addPathData("M18 13 12 7 6 13")
            addPathData("M12 7v14")
        }
        return _arrowUpToLine!!
    }

private var _arrowUpToLine: ImageVector? = null
