package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TextInitial: ImageVector
    get() {
        if (_textInitial != null) return _textInitial!!
        _textInitial = lucideOutlineIcon(
            name = "TextInitial",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 5h6")
            addPathData("M15 12h6")
            addPathData("M3 19h18")
            addPathData("M3 12 6.553 4.276C6.638 4.107 6.811 4 7 4c.189 0 .362 .107 .447 .276L11 12")
            addPathData("M3.92 10h6.16")
        }
        return _textInitial!!
    }

private var _textInitial: ImageVector? = null
