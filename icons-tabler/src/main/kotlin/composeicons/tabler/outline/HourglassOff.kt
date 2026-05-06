package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HourglassOff: ImageVector
    get() {
        if (_hourglassOff != null) return _hourglassOff!!
        _hourglassOff = tablerOutlineIcon(
            name = "HourglassOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 18v2c0 .552-.448 1-1 1h-10C6.448 21 6 20.552 6 20v-2c0-3.314 2.686-6 6-6")
            addPathData("M6 6c0 3.314 2.686 6 6 6M15.13 11.12C16.913 10.03 18 8.09 18 6v-2C18 3.448 17.552 3 17 3h-10")
            addPathData("M3 3 21 21")
        }
        return _hourglassOff!!
    }

private var _hourglassOff: ImageVector? = null
