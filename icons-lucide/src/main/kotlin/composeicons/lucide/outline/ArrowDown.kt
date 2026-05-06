package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = lucideOutlineIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5v14")
            addPathData("M19 12l-7 7L5 12")
        }
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
