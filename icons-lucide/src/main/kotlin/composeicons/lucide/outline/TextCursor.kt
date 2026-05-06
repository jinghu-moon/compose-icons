package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextCursor: ImageVector
    get() {
        if (_textCursor != null) return _textCursor!!
        _textCursor = lucideOutlineIcon(
            name = "TextCursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 22h-1c-2.209 0-4-1.791-4-4v-12C12 3.791 13.791 2 16 2h1")
            addPathData("M7 22h1c2.209 0 4-1.791 4-4v-1")
            addPathData("M7 2h1c2.209 0 4 1.791 4 4v1")
        }
        return _textCursor!!
    }

private var _textCursor: ImageVector? = null
