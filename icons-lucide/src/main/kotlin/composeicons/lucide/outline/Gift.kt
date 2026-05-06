package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = lucideOutlineIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v14")
            addPathData("M20 11v8c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-8")
            addPathData("M7.5 7C6.119 7 5 5.881 5 4.5 5 3.119 6.119 2 7.5 2 9.474 1.966 11.26 3.949 12 7c.74-3.051 2.526-5.034 4.5-5C17.881 2 19 3.119 19 4.5 19 5.881 17.881 7 16.5 7")
            addPathData("M4 7h16c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-16C3.448 11 3 10.552 3 10v-2C3 7.448 3.448 7 4 7Z")
        }
        return _gift!!
    }

private var _gift: ImageVector? = null
