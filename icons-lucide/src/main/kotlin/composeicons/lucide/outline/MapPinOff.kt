package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinOff: ImageVector
    get() {
        if (_mapPinOff != null) return _mapPinOff!!
        _mapPinOff = lucideOutlineIcon(
            name = "MapPinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.75 7.09c1.06 .272 1.888 1.1 2.16 2.16")
            addPathData("M17.072 17.072c-1.634 2.17-3.527 3.912-4.471 4.727-.356 .268-.846 .268-1.202 0C9.539 20.193 4 14.993 4 10 4 8.367 4.5 6.773 5.432 5.432")
            addPathData("M2 2 22 22")
            addPathData("M8.475 2.818c2.48-1.217 5.412-1.069 7.756 .392C18.575 4.671 20 7.238 20 10c0 1.183-.31 2.377-.81 3.533")
            addPathData("M9.13 9.13c-.32 1.059-.032 2.208 .75 2.99 .782 .782 1.931 1.07 2.99 .75")
        }
        return _mapPinOff!!
    }

private var _mapPinOff: ImageVector? = null
