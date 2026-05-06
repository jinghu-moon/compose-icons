package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StarOff: ImageVector
    get() {
        if (_starOff != null) return _starOff!!
        _starOff = tablerOutlineIcon(
            name = "StarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M10.012 6.016 11.993 2.002l3.086 6.253 6.9 1-4.421 4.304M17.57 17.569l.588 3.426L12 17.75 5.828 20.995 7.007 14.122l-5-4.867L8.334 8.338")
        }
        return _starOff!!
    }

private var _starOff: ImageVector? = null
