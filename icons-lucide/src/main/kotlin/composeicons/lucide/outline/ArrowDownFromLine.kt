package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDownFromLine: ImageVector
    get() {
        if (_arrowDownFromLine != null) return _arrowDownFromLine!!
        _arrowDownFromLine = lucideOutlineIcon(
            name = "ArrowDownFromLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 3h-14")
            addPathData("M12 21v-14")
            addPathData("M6 15l6 6 6-6")
        }
        return _arrowDownFromLine!!
    }

private var _arrowDownFromLine: ImageVector? = null
