package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathOff: ImageVector
    get() {
        if (_mathOff != null) return _mathOff!!
        _mathOff = tablerOutlineIcon(
            name = "MathOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 19l2.5-2.5")
            addPathData("M18.5 14.5 20 13")
            addPathData("M3 3 21 21")
            addPathData("M19 5h-7l-.646 2.262")
            addPathData("M10.448 10.431 8 19 5 13h-2")
        }
        return _mathOff!!
    }

private var _mathOff: ImageVector? = null
