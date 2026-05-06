package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockOff: ImageVector
    get() {
        if (_clockOff != null) return _clockOff!!
        _clockOff = tablerOutlineIcon(
            name = "ClockOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.633 5.64C3.33 7.909 2.42 11.238 3.251 14.363c.83 3.124 3.272 5.564 6.398 6.39 3.125 .826 6.454-.087 8.72-2.393M20.042 16.04C21.783 12.573 21.107 8.38 18.363 5.637 15.62 2.893 11.427 2.217 7.96 3.958")
            addPathData("M12 7v1")
            addPathData("M3 3 21 21")
        }
        return _clockOff!!
    }

private var _clockOff: ImageVector? = null
