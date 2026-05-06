package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExposureOff: ImageVector
    get() {
        if (_exposureOff != null) return _exposureOff!!
        _exposureOff = tablerOutlineIcon(
            name = "ExposureOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.6 20.4l8.371-8.371M14.011 9.989 20.4 3.6")
            addPathData("M6 8h2M8 8v2")
            addPathData("M14 16h2")
            addPathData("M7 3h12c1.105 0 2 .895 2 2v12M20.5 20.5C20.138 20.86 19.55 21 19 21h-14C3.895 21 3 20.105 3 19v-14C3 4.459 3.215 3.967 3.565 3.607")
            addPathData("M3 3 21 21")
        }
        return _exposureOff!!
    }

private var _exposureOff: ImageVector? = null
