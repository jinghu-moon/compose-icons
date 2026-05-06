package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dices: ImageVector
    get() {
        if (_dices != null) return _dices!!
        _dices = lucideOutlineIcon(
            name = "Dices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-8C2.895 22 2 21.105 2 20v-8c0-1.105 .895-2 2-2Z")
            addPathData("M17.92 14l3.5-3.5c.769-.852 .769-2.148 0-3l-5-4.92c-.852-.769-2.148-.769-3 0L10 6")
            addPathData("M6 18h.01")
            addPathData("M10 14h.01")
            addPathData("M15 6h.01")
            addPathData("M18 9h.01")
        }
        return _dices!!
    }

private var _dices: ImageVector? = null
