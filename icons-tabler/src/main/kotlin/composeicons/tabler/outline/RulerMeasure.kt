package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RulerMeasure: ImageVector
    get() {
        if (_rulerMeasure != null) return _rulerMeasure!!
        _rulerMeasure = tablerOutlineIcon(
            name = "RulerMeasure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.875 12c.621 0 1.125 .512 1.125 1.143v5.714C21 19.488 20.496 20 19.875 20h-15.875C3.448 20 3 19.552 3 19v-5.857C3 12.512 3.504 12 4.125 12h15.75")
            addPathData("M9 12v2")
            addPathData("M6 12v3")
            addPathData("M12 12v3")
            addPathData("M18 12v3")
            addPathData("M15 12v2")
            addPathData("M3 3v4")
            addPathData("M3 5h18")
            addPathData("M21 3v4")
        }
        return _rulerMeasure!!
    }

private var _rulerMeasure: ImageVector? = null
