package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heading5: ImageVector
    get() {
        if (_heading5 != null) return _heading5!!
        _heading5 = lucideOutlineIcon(
            name = "Heading5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h8")
            addPathData("M4 18v-12")
            addPathData("M12 18v-12")
            addPathData("M17 13v-3h4")
            addPathData("M17 17.7c.4 .2 .8 .3 1.3 .3C19.8 18 21 16.9 21 15.5 21 14.1 19.8 13 18.3 13h-1.3")
        }
        return _heading5!!
    }

private var _heading5: ImageVector? = null
