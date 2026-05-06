package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartCheck: ImageVector
    get() {
        if (_heartCheck != null) return _heartCheck!!
        _heartCheck = tablerOutlineIcon(
            name = "HeartCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 12.572l-3 2.928M11 19C8.834 16.856 6.668 14.714 4.5 12.572 3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.127 4.507 14.999 3.765 16.847 4.084c1.848 .319 3.363 1.646 3.922 3.437 .559 1.79 .069 3.743-1.269 5.058")
            addPathData("M15 19l2 2 4-4")
        }
        return _heartCheck!!
    }

private var _heartCheck: ImageVector? = null
