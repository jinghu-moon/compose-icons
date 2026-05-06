package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PointerOff: ImageVector
    get() {
        if (_pointerOff != null) return _pointerOff!!
        _pointerOff = lucideOutlineIcon(
            name = "PointerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 4.5v-.5C10 3.398 9.728 2.828 9.261 2.448 8.793 2.068 8.179 1.92 7.59 2.043")
            addPathData("M13.9 8.4C13.71 7.792 13.242 7.312 12.64 7.105")
            addPathData("M21.7 16.2c.202-.716 .303-1.456 .3-2.2v-3C22 9.895 21.105 9 20 9c-1.105 0-2 .895-2 2v-1C18 9.13 17.437 8.36 16.608 8.096c-.829-.264-1.734 .037-2.238 .746")
            addPathData("M7 15 5.2 13.2c-.799-.708-2.013-.664-2.758 .1-.745 .764-.759 1.979-.032 2.76L6 19.7c1.572 1.6 3.761 2.439 6 2.3h2c2.122 0 4.157-.843 5.657-2.343")
            addPathData("M6 6v8")
            addPathData("M2 2 22 22")
        }
        return _pointerOff!!
    }

private var _pointerOff: ImageVector? = null
