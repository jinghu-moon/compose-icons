package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdCircleOff: ImageVector
    get() {
        if (_adCircleOff != null) return _adCircleOff!!
        _adCircleOff = tablerOutlineIcon(
            name = "AdCircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.91 4.949C3.044 6.821 1.997 9.357 2 12c0 5.523 4.477 10 10 10 2.643 .003 5.179-1.043 7.05-2.909")
            addPathData("M20.778 16.793C21.582 15.324 22.002 13.675 22 12 22 6.477 17.523 2 12 2 10.26 2 8.624 2.444 7.2 3.225")
            addPathData("M7 15v-4.5c-0-.513 .262-.991 .696-1.267 .433-.275 .978-.31 1.442-.091")
            addPathData("M9.854 9.853c.094 .196 .146 .415 .146 .647v4.5")
            addPathData("M7 13h3")
            addPathData("M14 14v1h1")
            addPathData("M17 13v-2C17 9.895 16.105 9 15 9h-1v1")
            addPathData("M3 3 21 21")
        }
        return _adCircleOff!!
    }

private var _adCircleOff: ImageVector? = null
