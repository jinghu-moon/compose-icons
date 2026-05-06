package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DecimalsArrowRight: ImageVector
    get() {
        if (_decimalsArrowRight != null) return _decimalsArrowRight!!
        _decimalsArrowRight = lucideOutlineIcon(
            name = "DecimalsArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 18h10")
            addPathData("M17 21l3-3L17 15")
            addPathData("M3 11h.01")
            addPathData("M17.5 3h0C18.881 3 20 4.119 20 5.5v3C20 9.881 18.881 11 17.5 11h0C16.119 11 15 9.881 15 8.5v-3C15 4.119 16.119 3 17.5 3Z")
            addPathData("M8.5 3h0C9.881 3 11 4.119 11 5.5v3C11 9.881 9.881 11 8.5 11h0C7.119 11 6 9.881 6 8.5v-3C6 4.119 7.119 3 8.5 3Z")
        }
        return _decimalsArrowRight!!
    }

private var _decimalsArrowRight: ImageVector? = null
