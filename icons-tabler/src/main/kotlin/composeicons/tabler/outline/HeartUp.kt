package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartUp: ImageVector
    get() {
        if (_heartUp != null) return _heartUp!!
        _heartUp = tablerOutlineIcon(
            name = "HeartUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20 4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.089 4.573 14.864 3.835 16.648 4.075c1.784 .24 3.301 1.42 3.973 3.09 .672 1.67 .394 3.572-.728 4.98")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _heartUp!!
    }

private var _heartUp: ImageVector? = null
