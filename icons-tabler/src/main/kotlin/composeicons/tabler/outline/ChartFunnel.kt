package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartFunnel: ImageVector
    get() {
        if (_chartFunnel != null) return _chartFunnel!!
        _chartFunnel = tablerOutlineIcon(
            name = "ChartFunnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.387 3h15.226c.321 0 .623 .155 .811 .416 .188 .261 .239 .596 .137 .9L15.456 19.632c-.272 .817-1.037 1.368-1.898 1.368h-3.116c-.861 0-1.626-.551-1.898-1.368L3.44 4.316c-.101-.305-.05-.639 .137-.9C3.765 3.155 4.066 3.001 4.387 3")
            addPathData("M5 9h14")
            addPathData("M7 15h10")
        }
        return _chartFunnel!!
    }

private var _chartFunnel: ImageVector? = null
