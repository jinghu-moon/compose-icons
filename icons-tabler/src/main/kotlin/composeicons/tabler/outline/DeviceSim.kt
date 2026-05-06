package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceSim: ImageVector
    get() {
        if (_deviceSim != null) return _deviceSim!!
        _deviceSim = tablerOutlineIcon(
            name = "DeviceSim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3h8.5L19 7.5v12.5c0 .552-.448 1-1 1h-12C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3")
            addPathData("M9 11h3v6")
            addPathData("M15 17v.01")
            addPathData("M15 14v.01")
            addPathData("M15 11v.01")
            addPathData("M9 14v.01")
            addPathData("M9 17v.01")
        }
        return _deviceSim!!
    }

private var _deviceSim: ImageVector? = null
