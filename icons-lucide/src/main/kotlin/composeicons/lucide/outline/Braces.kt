package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Braces: ImageVector
    get() {
        if (_braces != null) return _braces!!
        _braces = lucideOutlineIcon(
            name = "Braces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3h-1C5.895 3 5 3.895 5 5v5c0 1.105-.895 2-2 2 1.105 0 2 .895 2 2v5c0 1.1 .9 2 2 2h1")
            addPathData("M16 21h1c1.105 0 2-.895 2-2v-5c0-1.1 .9-2 2-2-1.105 0-2-.895-2-2v-5C19 3.895 18.105 3 17 3h-1")
        }
        return _braces!!
    }

private var _braces: ImageVector? = null
