package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heading6: ImageVector
    get() {
        if (_heading6 != null) return _heading6!!
        _heading6 = lucideOutlineIcon(
            name = "Heading6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h8")
            addPathData("M4 18v-12")
            addPathData("M12 18v-12")
            addPathData("M21 16c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M20 10c-2 2-3 3.5-3 6")
        }
        return _heading6!!
    }

private var _heading6: ImageVector? = null
