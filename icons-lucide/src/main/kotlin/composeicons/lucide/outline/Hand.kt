package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = lucideOutlineIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 11v-5C18 4.895 17.105 4 16 4c-1.105 0-2 .895-2 2")
            addPathData("M14 10v-6C14 2.895 13.105 2 12 2c-1.105 0-2 .895-2 2v2")
            addPathData("M10 10.5v-4.5C10 4.895 9.105 4 8 4 6.895 4 6 4.895 6 6v8")
            addPathData("M18 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6c0 4.418-3.582 8-8 8h-2C9.2 22 7.5 21.14 6.01 19.66L2.41 16.06c-.715-.791-.683-2.004 .073-2.757 .755-.753 1.968-.78 2.757-.063L7 15")
        }
        return _hand!!
    }

private var _hand: ImageVector? = null
