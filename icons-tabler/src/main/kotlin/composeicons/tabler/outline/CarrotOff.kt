package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarrotOff: ImageVector
    get() {
        if (_carrotOff != null) return _carrotOff!!
        _carrotOff = tablerOutlineIcon(
            name = "CarrotOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.868 8.846C6.112 12.228 3 21 3 21c0 0 8.75-3.104 12.134-5.85M16.801 12.808c.489-1.585 .063-3.311-1.107-4.487C14.523 7.145 12.8 6.711 11.212 7.193")
            addPathData("M9 13 7.5 11.5")
            addPathData("M22 8C22 8 20.86 6 19 6 17.594 6 16 8 16 8c0 0 1.14 2 3 2 1.86 0 3-2 3-2")
            addPathData("M16 2c0 0-2 1.14-2 3 0 1.86 2 3 2 3 0 0 2-1.577 2-3C18 3.14 16 2 16 2")
            addPathData("M3 3 21 21")
        }
        return _carrotOff!!
    }

private var _carrotOff: ImageVector? = null
