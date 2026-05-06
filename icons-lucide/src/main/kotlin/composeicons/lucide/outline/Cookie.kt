package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = lucideOutlineIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10-1.416 .436-2.958 .053-4.006-.994C16.947 9.958 16.564 8.416 17 7c-1.416 .436-2.958 .053-4.006-.994C11.947 4.958 11.564 3.416 12 2")
            addPathData("M8.5 8.5v.01")
            addPathData("M16 15.5v.01")
            addPathData("M12 12v.01")
            addPathData("M11 17v.01")
            addPathData("M7 14v.01")
        }
        return _cookie!!
    }

private var _cookie: ImageVector? = null
