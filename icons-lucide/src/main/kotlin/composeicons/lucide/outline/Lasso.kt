package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = lucideOutlineIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.704 14.467C.853 11.08 1.649 6.519 5.549 3.885 9.45 1.252 15.203 1.391 18.898 4.208c3.695 2.817 4.145 7.408 1.044 10.651-3.101 3.243-8.757 4.098-13.123 1.983")
            addPathData("M7 22C5.743 21.057 5.002 19.578 5 18.006")
            addPathData("M7 16c0 1.105-.895 2-2 2C3.895 18 3 17.105 3 16c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _lasso!!
    }

private var _lasso: ImageVector? = null
