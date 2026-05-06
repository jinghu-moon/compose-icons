package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AxisY: ImageVector
    get() {
        if (_axisY != null) return _axisY!!
        _axisY = tablerOutlineIcon(
            name = "AxisY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20h-.01")
            addPathData("M15 20h-.01")
            addPathData("M19 20h-.01")
            addPathData("M4 7 7 4l3 3")
            addPathData("M7 20v-16")
        }
        return _axisY!!
    }

private var _axisY: ImageVector? = null
