package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GraphOff: ImageVector
    get() {
        if (_graphOff != null) return _graphOff!!
        _graphOff = tablerOutlineIcon(
            name = "GraphOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.414 19.414c-.375 .375-.884 .586-1.414 .586h-12C4.895 20 4 19.105 4 18v-12C4 5.453 4.22 4.957 4.576 4.595")
            addPathData("M7 14l3-3 2 2 .5-.5M14.5 10.5 15 10l2 2")
            addPathData("M3 3 21 21")
        }
        return _graphOff!!
    }

private var _graphOff: ImageVector? = null
