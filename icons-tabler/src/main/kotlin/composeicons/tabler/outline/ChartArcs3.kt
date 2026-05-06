package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartArcs3: ImageVector
    get() {
        if (_chartArcs3 != null) return _chartArcs3!!
        _chartArcs3 = tablerOutlineIcon(
            name = "ChartArcs3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.239 14.761 7 12 7")
            addPathData("M6.29 18.957c3.064 2.515 7.413 2.729 10.71 .526 3.296-2.202 4.763-6.302 3.613-10.096C19.462 5.594 15.964 3 12 3")
        }
        return _chartArcs3!!
    }

private var _chartArcs3: ImageVector? = null
