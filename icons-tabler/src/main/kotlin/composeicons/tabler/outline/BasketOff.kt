package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BasketOff: ImageVector
    get() {
        if (_basketOff != null) return _basketOff!!
        _basketOff = tablerOutlineIcon(
            name = "BasketOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 10 15 4")
            addPathData("M7 10 7.75 7.748 8.751 4.746 9 4")
            addPathData("M12 8h7c.584-0 1.138 .255 1.518 .698 .38 .443 .548 1.03 .459 1.606C20.535 12.82 20.221 14.742 20 16M18.99 19.003c-.569 .635-1.381 .998-2.234 .997h-9.512C5.763 20 4.504 18.92 4.279 17.456L3.024 10.304C2.935 9.727 3.103 9.14 3.483 8.698 3.863 8.255 4.417 8 5.001 8h2.999")
            addPathData("M12 12c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M3 3 21 21")
        }
        return _basketOff!!
    }

private var _basketOff: ImageVector? = null
