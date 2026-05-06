package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPie4: ImageVector
    get() {
        if (_chartPie4 != null) return _chartPie4!!
        _chartPie4 = tablerOutlineIcon(
            name = "ChartPie4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12 5.5 17.5")
            addPathData("M12 3v9h9")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 12l5 7.5")
        }
        return _chartPie4!!
    }

private var _chartPie4: ImageVector? = null
