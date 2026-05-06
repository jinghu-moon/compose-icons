package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UmbrellaOff: ImageVector
    get() {
        if (_umbrellaOff != null) return _umbrellaOff!!
        _umbrellaOff = tablerOutlineIcon(
            name = "UmbrellaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h-8C4 9.791 4.895 7.792 6.342 6.344M8.724 4.699c2.476-1.111 5.346-.892 7.624 .583C18.626 6.757 20.001 9.286 20 12h-4")
            addPathData("M12 12v6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M3 3 21 21")
        }
        return _umbrellaOff!!
    }

private var _umbrellaOff: ImageVector? = null
