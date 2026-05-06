package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleDollarSign: ImageVector
    get() {
        if (_circleDollarSign != null) return _circleDollarSign!!
        _circleDollarSign = lucideOutlineIcon(
            name = "CircleDollarSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M16 8h-6C8.895 8 8 8.895 8 10c0 1.105 .895 2 2 2h4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-6")
            addPathData("M12 18v-12")
        }
        return _circleDollarSign!!
    }

private var _circleDollarSign: ImageVector? = null
