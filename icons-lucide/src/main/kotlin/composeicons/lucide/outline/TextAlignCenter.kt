package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) return _textAlignCenter!!
        _textAlignCenter = lucideOutlineIcon(
            name = "TextAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-18")
            addPathData("M17 12h-10")
            addPathData("M19 19h-14")
        }
        return _textAlignCenter!!
    }

private var _textAlignCenter: ImageVector? = null
