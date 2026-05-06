package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextAlignJustify: ImageVector
    get() {
        if (_textAlignJustify != null) return _textAlignJustify!!
        _textAlignJustify = lucideOutlineIcon(
            name = "TextAlignJustify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h18")
            addPathData("M3 12h18")
            addPathData("M3 19h18")
        }
        return _textAlignJustify!!
    }

private var _textAlignJustify: ImageVector? = null
