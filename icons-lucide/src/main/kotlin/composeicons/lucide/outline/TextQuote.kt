package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextQuote: ImageVector
    get() {
        if (_textQuote != null) return _textQuote!!
        _textQuote = lucideOutlineIcon(
            name = "TextQuote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 5h-14")
            addPathData("M21 12h-13")
            addPathData("M21 19h-13")
            addPathData("M3 12v7")
        }
        return _textQuote!!
    }

private var _textQuote: ImageVector? = null
