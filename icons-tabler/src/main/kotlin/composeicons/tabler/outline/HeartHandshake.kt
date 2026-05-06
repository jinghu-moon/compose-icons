package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartHandshake: ImageVector
    get() {
        if (_heartHandshake != null) return _heartHandshake!!
        _heartHandshake = tablerOutlineIcon(
            name = "HeartHandshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 12.572 12 20 4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.127 4.507 14.999 3.765 16.847 4.084c1.848 .319 3.363 1.646 3.922 3.437 .559 1.79 .069 3.743-1.269 5.058")
            addPathData("M12 6 8.707 9.293c-.39 .391-.39 1.023 0 1.414l.543 .543c.69 .69 1.81 .69 2.5 0l1-1c1.243-1.243 3.257-1.243 4.5 0l2.25 2.25")
            addPathData("M12.5 15.5l2 2")
            addPathData("M15 13l2 2")
        }
        return _heartHandshake!!
    }

private var _heartHandshake: ImageVector? = null
