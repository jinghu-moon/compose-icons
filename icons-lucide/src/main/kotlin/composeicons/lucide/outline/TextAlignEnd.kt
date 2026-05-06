package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextAlignEnd: ImageVector
    get() {
        if (_textAlignEnd != null) return _textAlignEnd!!
        _textAlignEnd = lucideOutlineIcon(
            name = "TextAlignEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-18")
            addPathData("M21 12h-12")
            addPathData("M21 19h-14")
        }
        return _textAlignEnd!!
    }

private var _textAlignEnd: ImageVector? = null
