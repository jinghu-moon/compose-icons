package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = lucideOutlineIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M14.83 14.83c-1.563 1.561-4.094 1.56-5.656-.002C7.613 13.266 7.613 10.734 9.174 9.172c1.561-1.562 4.093-1.563 5.656-.002")
        }
        return _copyright!!
    }

private var _copyright: ImageVector? = null
