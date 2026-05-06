package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = lucideOutlineIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.3 15.3c.452 .45 .706 1.062 .706 1.7 0 .638-.254 1.25-.706 1.7l-2.6 2.6c-.45 .452-1.062 .706-1.7 .706-.638 0-1.25-.254-1.7-.706L2.7 8.7c-.936-.94-.936-2.46 0-3.4L5.3 2.7c.94-.936 2.46-.936 3.4 0Z")
            addPathData("M14.5 12.5l2-2")
            addPathData("M11.5 9.5l2-2")
            addPathData("M8.5 6.5l2-2")
            addPathData("M17.5 15.5l2-2")
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
