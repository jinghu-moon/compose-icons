package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PennantOff: ImageVector
    get() {
        if (_pennantOff != null) return _pennantOff!!
        _pennantOff = tablerOutlineIcon(
            name = "PennantOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h4")
            addPathData("M10 21v-11M10 6v-3")
            addPathData("M10 4l9 4-4.858 2.16M11.378 11.387 10 12")
            addPathData("M3 3 21 21")
        }
        return _pennantOff!!
    }

private var _pennantOff: ImageVector? = null
