package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextCursorInput: ImageVector
    get() {
        if (_textCursorInput != null) return _textCursorInput!!
        _textCursorInput = lucideOutlineIcon(
            name = "TextCursorInput",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-1C9.895 20 9 19.105 9 18c0 1.105-.895 2-2 2h-1")
            addPathData("M13 8h7c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-7")
            addPathData("M5 16h-1C2.895 16 2 15.105 2 14v-4C2 8.895 2.895 8 4 8h1")
            addPathData("M6 4h1c1.105 0 2 .895 2 2C9 4.895 9.895 4 11 4h1")
            addPathData("M9 6v12")
        }
        return _textCursorInput!!
    }

private var _textCursorInput: ImageVector? = null
