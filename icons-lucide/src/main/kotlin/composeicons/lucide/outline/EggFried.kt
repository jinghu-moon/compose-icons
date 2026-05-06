package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = lucideOutlineIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12.5C15 14.433 13.433 16 11.5 16 9.567 16 8 14.433 8 12.5 8 10.567 9.567 9 11.5 9 13.433 9 15 10.567 15 12.5Z")
            addPathData("M3 8C3 4.5 5.5 2 9.5 2c5 0 4.83 3 7.5 5 2.67 2 5 2 5 6 0 4.5-2.5 6.5-7 6.5C12.5 19.5 12.5 22 9 22 5.5 22 2 20 2 16.5c0-3 1.5-3 1.5-5C3.5 10 3 9 3 8Z")
        }
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
