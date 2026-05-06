package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AxisX: ImageVector
    get() {
        if (_axisX != null) return _axisX!!
        _axisX = tablerOutlineIcon(
            name = "AxisX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13v.01")
            addPathData("M4 9v.01")
            addPathData("M4 5v.01")
            addPathData("M17 20l3-3L17 14")
            addPathData("M4 17h16")
        }
        return _axisX!!
    }

private var _axisX: ImageVector? = null
