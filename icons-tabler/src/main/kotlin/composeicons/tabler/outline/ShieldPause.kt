package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldPause: ImageVector
    get() {
        if (_shieldPause != null) return _shieldPause!!
        _shieldPause = tablerOutlineIcon(
            name = "ShieldPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.004 20.692c-.329 .117-.664 .22-1.004 .308C8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .676 2.3 .648 4.75-.081 7.034")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _shieldPause!!
    }

private var _shieldPause: ImageVector? = null
