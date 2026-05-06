package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartOff: ImageVector
    get() {
        if (_heartOff != null) return _heartOff!!
        _heartOff = tablerOutlineIcon(
            name = "HeartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M19.5 12.572 18 14 16 16l-4 4L4.5 12.572C3.151 11.26 2.653 9.301 3.212 7.504 3.529 6.501 4.154 5.625 5 5M8 4c1.56 0 3.05 .727 4 2C13.127 4.501 14.999 3.759 16.847 4.078c1.848 .319 3.363 1.646 3.922 3.437 .559 1.79 .069 3.743-1.269 5.058")
        }
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
