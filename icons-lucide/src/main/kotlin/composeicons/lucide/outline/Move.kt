package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Move: ImageVector
    get() {
        if (_move != null) return _move!!
        _move = lucideOutlineIcon(
            name = "Move",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v20")
            addPathData("M15 19l-3 3L9 19")
            addPathData("M19 9l3 3-3 3")
            addPathData("M2 12h20")
            addPathData("M5 9 2 12l3 3")
            addPathData("M9 5 12 2l3 3")
        }
        return _move!!
    }

private var _move: ImageVector? = null
