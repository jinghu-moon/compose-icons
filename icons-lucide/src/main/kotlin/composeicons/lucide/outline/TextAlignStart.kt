package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextAlignStart: ImageVector
    get() {
        if (_textAlignStart != null) return _textAlignStart!!
        _textAlignStart = lucideOutlineIcon(
            name = "TextAlignStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-18")
            addPathData("M15 12h-12")
            addPathData("M17 19h-14")
        }
        return _textAlignStart!!
    }

private var _textAlignStart: ImageVector? = null
