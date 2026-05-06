package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartArrowsVertical: ImageVector
    get() {
        if (_chartArrowsVertical != null) return _chartArrowsVertical!!
        _chartArrowsVertical = tablerOutlineIcon(
            name = "ChartArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 21v-14")
            addPathData("M9 15l3-3 3 3")
            addPathData("M15 10 18 7l3 3")
            addPathData("M3 21h18")
            addPathData("M12 21v-9")
            addPathData("M3 6 6 3 9 6")
            addPathData("M6 21v-18")
        }
        return _chartArrowsVertical!!
    }

private var _chartArrowsVertical: ImageVector? = null
