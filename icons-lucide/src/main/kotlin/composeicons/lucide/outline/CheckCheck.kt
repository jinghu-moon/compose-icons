package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CheckCheck: ImageVector
    get() {
        if (_checkCheck != null) return _checkCheck!!
        _checkCheck = lucideOutlineIcon(
            name = "CheckCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 6 7 17 2 12")
            addPathData("M22 10l-7.5 7.5L13 16")
        }
        return _checkCheck!!
    }

private var _checkCheck: ImageVector? = null
