package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = lucideOutlineIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3c-1.105 0-2 .895-2 2v6c0 1.105 .895 2 2 2 .552 0 1 .448 1 1v1c0 1.105-.895 2-2 2-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1 3.314 0 6-2.686 6-6v-10C21 3.895 20.105 3 19 3Z")
            addPathData("M5 3C3.895 3 3 3.895 3 5v6c0 1.105 .895 2 2 2 .552 0 1 .448 1 1v1c0 1.105-.895 2-2 2-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1 3.314 0 6-2.686 6-6v-10C10 3.895 9.105 3 8 3Z")
        }
        return _quote!!
    }

private var _quote: ImageVector? = null
