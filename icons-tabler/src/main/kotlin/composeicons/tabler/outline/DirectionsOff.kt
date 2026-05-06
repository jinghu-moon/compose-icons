package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DirectionsOff: ImageVector
    get() {
        if (_directionsOff != null) return _directionsOff!!
        _directionsOff = tablerOutlineIcon(
            name = "DirectionsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21v-4")
            addPathData("M12 13v-1")
            addPathData("M12 5v-2")
            addPathData("M10 21h4")
            addPathData("M8 8v1h1M13 9h6L21 7 19 5h-10")
            addPathData("M14 14v3h-8L4 15 6 13h7")
            addPathData("M3 3 21 21")
        }
        return _directionsOff!!
    }

private var _directionsOff: ImageVector? = null
