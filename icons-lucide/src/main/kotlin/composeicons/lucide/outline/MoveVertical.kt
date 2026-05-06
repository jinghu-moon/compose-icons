package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveVertical: ImageVector
    get() {
        if (_moveVertical != null) return _moveVertical!!
        _moveVertical = lucideOutlineIcon(
            name = "MoveVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v20")
            addPathData("M8 18l4 4 4-4")
            addPathData("M8 6 12 2l4 4")
        }
        return _moveVertical!!
    }

private var _moveVertical: ImageVector? = null
