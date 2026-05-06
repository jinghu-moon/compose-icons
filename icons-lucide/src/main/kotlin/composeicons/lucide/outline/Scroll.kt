package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = lucideOutlineIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 17v-12C19 3.895 18.105 3 17 3h-13")
            addPathData("M8 21h12c1.105 0 2-.895 2-2v-1c0-.552-.448-1-1-1h-10c-.552 0-1 .448-1 1v1c0 1.105-.895 2-2 2C6.895 21 6 20.105 6 19v-14C6 3.895 5.105 3 4 3 2.895 3 2 3.895 2 5v2c0 .552 .448 1 1 1h3")
        }
        return _scroll!!
    }

private var _scroll: ImageVector? = null
