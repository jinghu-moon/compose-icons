package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartCovariate: ImageVector
    get() {
        if (_chartCovariate != null) return _chartCovariate!!
        _chartCovariate = tablerOutlineIcon(
            name = "ChartCovariate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 11h.009")
            addPathData("M14 15h.009")
            addPathData("M12 6h.009")
            addPathData("M8 10h.009")
            addPathData("M3 21 20 4")
            addPathData("M3 3v18h18")
        }
        return _chartCovariate!!
    }

private var _chartCovariate: ImageVector? = null
