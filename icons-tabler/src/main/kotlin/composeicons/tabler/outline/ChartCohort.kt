package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartCohort: ImageVector
    get() {
        if (_chartCohort != null) return _chartCohort!!
        _chartCohort = tablerOutlineIcon(
            name = "ChartCohort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9h18v-6h-18v18h6v-18")
            addPathData("M3 15h12v-12")
        }
        return _chartCohort!!
    }

private var _chartCohort: ImageVector? = null
