package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = lucideOutlineIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11 3 17v3h9l3-3")
            addPathData("M22 12l-4.6 4.6c-.778 .762-2.022 .762-2.8 0L9.4 11.4c-.762-.778-.762-2.022 0-2.8L14 4")
        }
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
