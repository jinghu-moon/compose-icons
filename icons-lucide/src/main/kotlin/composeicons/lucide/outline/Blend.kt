package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Blend: ImageVector
    get() {
        if (_blend != null) return _blend!!
        _blend = lucideOutlineIcon(
            name = "Blend",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 9c0 3.866-3.134 7-7 7C5.134 16 2 12.866 2 9 2 5.134 5.134 2 9 2c3.866 0 7 3.134 7 7Z")
            addPathData("M22 15c0 3.866-3.134 7-7 7C11.134 22 8 18.866 8 15 8 11.134 11.134 8 15 8c3.866 0 7 3.134 7 7Z")
        }
        return _blend!!
    }

private var _blend: ImageVector? = null
