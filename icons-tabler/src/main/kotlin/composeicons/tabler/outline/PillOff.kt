package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PillOff: ImageVector
    get() {
        if (_pillOff != null) return _pillOff!!
        _pillOff = tablerOutlineIcon(
            name = "PillOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.495 6.505l2-2c1.939-1.9 5.046-1.884 6.965 .035 1.919 1.919 1.935 5.026 .035 6.965l-2 2M15.495 15.505l-4 4C9.556 21.405 6.449 21.389 4.53 19.47 2.611 17.551 2.595 14.444 4.495 12.505l4-4")
            addPathData("M8.5 8.5l7 7")
            addPathData("M3 3 21 21")
        }
        return _pillOff!!
    }

private var _pillOff: ImageVector? = null
