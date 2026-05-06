package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = lucideOutlineIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19 5 12 12 5")
            addPathData("M19 12h-14")
        }
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
