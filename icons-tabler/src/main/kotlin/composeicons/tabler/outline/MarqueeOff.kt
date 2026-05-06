package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MarqueeOff: ImageVector
    get() {
        if (_marqueeOff != null) return _marqueeOff!!
        _marqueeOff = tablerOutlineIcon(
            name = "MarqueeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6C4 5.444 4.227 4.941 4.593 4.579")
            addPathData("M9 4h1.5")
            addPathData("M13.5 4h1.5")
            addPathData("M18 4c1.105 0 2 .895 2 2")
            addPathData("M20 9v1.5")
            addPathData("M20 13.5v1.5")
            addPathData("M19.402 19.426c-.374 .368-.877 .575-1.402 .574")
            addPathData("M15 20h-1.5")
            addPathData("M10.5 20h-1.5")
            addPathData("M6 20C4.895 20 4 19.105 4 18")
            addPathData("M4 15v-1.5")
            addPathData("M4 10.5v-1.5")
            addPathData("M3 3 21 21")
        }
        return _marqueeOff!!
    }

private var _marqueeOff: ImageVector? = null
