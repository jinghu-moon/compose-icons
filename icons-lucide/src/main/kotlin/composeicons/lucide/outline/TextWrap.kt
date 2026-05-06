package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextWrap: ImageVector
    get() {
        if (_textWrap != null) return _textWrap!!
        _textWrap = lucideOutlineIcon(
            name = "TextWrap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16l-3 3 3 3")
            addPathData("M3 12h14.5C19.433 12 21 13.567 21 15.5 21 17.433 19.433 19 17.5 19h-4.5")
            addPathData("M3 19h6")
            addPathData("M3 5h18")
        }
        return _textWrap!!
    }

private var _textWrap: ImageVector? = null
