package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Type: ImageVector
    get() {
        if (_type != null) return _type!!
        _type = lucideOutlineIcon(
            name = "Type",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v16")
            addPathData("M4 7v-2C4 4.448 4.448 4 5 4h14c.552 0 1 .448 1 1v2")
            addPathData("M9 20h6")
        }
        return _type!!
    }

private var _type: ImageVector? = null
