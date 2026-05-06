package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartScatter3D: ImageVector
    get() {
        if (_chartScatter3D != null) return _chartScatter3D!!
        _chartScatter3D = tablerOutlineIcon(
            name = "ChartScatter3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 20l9-7")
            addPathData("M12 3v10l9 7")
            addPathData("M17 12v.015")
            addPathData("M17 4.015v.015")
            addPathData("M21 8.015v.015")
            addPathData("M12 19.015v.015")
            addPathData("M3 12.015v.015")
            addPathData("M7 8.015v.015")
            addPathData("M3 4.015v.015")
        }
        return _chartScatter3D!!
    }

private var _chartScatter3D: ImageVector? = null
