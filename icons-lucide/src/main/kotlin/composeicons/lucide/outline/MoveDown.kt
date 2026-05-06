package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveDown: ImageVector
    get() {
        if (_moveDown != null) return _moveDown!!
        _moveDown = lucideOutlineIcon(
            name = "MoveDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 18l4 4 4-4")
            addPathData("M12 2v20")
        }
        return _moveDown!!
    }

private var _moveDown: ImageVector? = null
