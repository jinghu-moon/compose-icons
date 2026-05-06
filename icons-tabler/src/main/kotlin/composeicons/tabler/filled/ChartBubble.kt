package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartBubble: ImageVector
    get() {
        if (_chartBubble != null) return _chartBubble!!
        _chartBubble = tablerFilledIcon(
            name = "ChartBubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064C3.951 20.071 2.114 18.38 2.005 16.2L2 16l.005-.2C2.112 13.671 3.869 12 6 12Z")
            addPathData("M16 16c1.634 0 2.967 1.308 2.999 2.941 .032 1.634-1.249 2.992-2.882 3.056-1.633 .064-3.016-1.191-3.112-2.822L13 19l.005-.176C13.098 17.238 14.411 16 16 16Z")
            addPathData("M14.5 2c3.009 0 5.459 2.418 5.499 5.427 .04 3.009-2.345 5.491-5.352 5.571C11.639 13.079 9.125 10.727 9.004 7.721L9 7.5l.004-.221C9.123 4.33 11.548 2 14.5 2Z")
        }
        return _chartBubble!!
    }

private var _chartBubble: ImageVector? = null
