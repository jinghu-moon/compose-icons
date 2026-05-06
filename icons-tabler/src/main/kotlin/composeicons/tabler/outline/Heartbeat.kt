package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = tablerOutlineIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 13.572 12 21 9.104 18.132 2.987 10.028C2.97 7.865 4.346 5.936 6.397 5.248 8.449 4.56 10.71 5.27 12 7.006 13.127 5.507 14.999 4.765 16.847 5.084c1.848 .319 3.363 1.646 3.922 3.437 .559 1.79 .069 3.743-1.269 5.058")
            addPathData("M3 13h2l2 3L9 10l1 3h3")
        }
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
