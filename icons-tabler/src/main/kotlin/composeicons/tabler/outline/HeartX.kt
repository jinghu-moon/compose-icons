package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartX: ImageVector
    get() {
        if (_heartX != null) return _heartX!!
        _heartX = tablerOutlineIcon(
            name = "HeartX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 12.572 19 13 13 19l-1 1L4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.127 4.507 14.999 3.765 16.847 4.084c1.848 .319 3.363 1.646 3.922 3.437 .559 1.79 .069 3.743-1.269 5.058")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _heartX!!
    }

private var _heartX: ImageVector? = null
