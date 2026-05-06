package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Currency: ImageVector
    get() {
        if (_currency != null) return _currency!!
        _currency = lucideOutlineIcon(
            name = "Currency",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 12c0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8Z")
            addPathData("M3 3 6 6")
            addPathData("M21 3 18 6")
            addPathData("M3 21 6 18")
            addPathData("M21 21 18 18")
        }
        return _currency!!
    }

private var _currency: ImageVector? = null
