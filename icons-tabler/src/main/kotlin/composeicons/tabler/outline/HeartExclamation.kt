package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartExclamation: ImageVector
    get() {
        if (_heartExclamation != null) return _heartExclamation!!
        _heartExclamation = tablerOutlineIcon(
            name = "HeartExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.03 17 12 20 4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006 13.084 4.573 14.853 3.832 16.635 4.065c1.782 .233 3.301 1.403 3.981 3.066 .68 1.663 .415 3.563-.694 4.977")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _heartExclamation!!
    }

private var _heartExclamation: ImageVector? = null
