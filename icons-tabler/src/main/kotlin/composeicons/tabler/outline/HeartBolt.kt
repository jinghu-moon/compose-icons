package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartBolt: ImageVector
    get() {
        if (_heartBolt != null) return _heartBolt!!
        _heartBolt = tablerOutlineIcon(
            name = "HeartBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19l-1 1L4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.656 3.796 16.79 3.347 19 5.003c2.21 1.656 2.659 4.79 1.003 7")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _heartBolt!!
    }

private var _heartBolt: ImageVector? = null
