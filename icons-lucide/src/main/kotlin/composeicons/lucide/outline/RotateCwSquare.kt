package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RotateCwSquare: ImageVector
    get() {
        if (_rotateCwSquare != null) return _rotateCwSquare!!
        _rotateCwSquare = lucideOutlineIcon(
            name = "RotateCwSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5h-6C4.895 5 4 5.895 4 7v3")
            addPathData("M9 8 12 5 9 2")
            addPathData("M4 14v4c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-11C20 5.895 19.105 5 18 5h-2")
        }
        return _rotateCwSquare!!
    }

private var _rotateCwSquare: ImageVector? = null
