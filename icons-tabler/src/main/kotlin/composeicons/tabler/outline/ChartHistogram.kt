package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartHistogram: ImageVector
    get() {
        if (_chartHistogram != null) return _chartHistogram!!
        _chartHistogram = tablerOutlineIcon(
            name = "ChartHistogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3v18h18")
            addPathData("M20 18v3")
            addPathData("M16 16v5")
            addPathData("M12 13v8")
            addPathData("M8 16v5")
            addPathData("M3 11C9 11 8 6 12 6c4 0 3 5 9 5")
        }
        return _chartHistogram!!
    }

private var _chartHistogram: ImageVector? = null
