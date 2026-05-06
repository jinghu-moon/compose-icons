package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DecimalsArrowLeft: ImageVector
    get() {
        if (_decimalsArrowLeft != null) return _decimalsArrowLeft!!
        _decimalsArrowLeft = lucideOutlineIcon(
            name = "DecimalsArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 21 10 18l3-3")
            addPathData("M20 18h-10")
            addPathData("M3 11h.01")
            addPathData("M8.5 3h0C9.881 3 11 4.119 11 5.5v3C11 9.881 9.881 11 8.5 11h0C7.119 11 6 9.881 6 8.5v-3C6 4.119 7.119 3 8.5 3Z")
        }
        return _decimalsArrowLeft!!
    }

private var _decimalsArrowLeft: ImageVector? = null
