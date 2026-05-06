package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartRadar: ImageVector
    get() {
        if (_chartRadar != null) return _chartRadar!!
        _chartRadar = tablerOutlineIcon(
            name = "ChartRadar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3l9.5 7L18 21h-12L2.5 10 12 3")
            addPathData("M12 7.5l5.5 4L15 17h-6.5l-2-5.5L12 7.5")
            addPathData("M2.5 10 12 13l9.5-3")
            addPathData("M12 3v10l6 8")
            addPathData("M6 21l6-8")
        }
        return _chartRadar!!
    }

private var _chartRadar: ImageVector? = null
