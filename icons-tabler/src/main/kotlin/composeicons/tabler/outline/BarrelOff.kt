package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BarrelOff: ImageVector
    get() {
        if (_barrelOff != null) return _barrelOff!!
        _barrelOff = tablerOutlineIcon(
            name = "BarrelOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h8.722c.803 0 1.528 .481 1.841 1.22C19.521 7.48 20 9.74 20 12c-.001 1.214-.138 2.425-.407 3.609M18.629 18.622l-.066 .158c-.313 .739-1.038 1.22-1.841 1.22h-9.444C6.475 20 5.75 19.519 5.437 18.78 4.479 16.52 4 14.26 4 12 4 9.79 4.458 7.58 5.374 5.37")
            addPathData("M14 4c.585 2.337 .913 4.674 .985 7.01M14.871 14.87C14.714 16.6 14.423 18.315 14 20")
            addPathData("M10 4c-.135 .541-.257 1.085-.366 1.632M9.128 9.133C9.043 10.086 9 11.043 9 12c0 2.667 .333 5.333 1 8")
            addPathData("M4.5 16h11.5")
            addPathData("M19.5 8h-7.5M8 8h-3.5")
            addPathData("M3 3 21 21")
        }
        return _barrelOff!!
    }

private var _barrelOff: ImageVector? = null
