package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RobotOff: ImageVector
    get() {
        if (_robotOff != null) return _robotOff!!
        _robotOff = tablerOutlineIcon(
            name = "RobotOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2M12 12h-4C6.895 12 6 11.105 6 10v-4")
            addPathData("M12 2v2")
            addPathData("M9 12v9")
            addPathData("M15 15v6")
            addPathData("M5 16 9 14")
            addPathData("M9 18h6")
            addPathData("M14 8v.01")
            addPathData("M3 3 21 21")
        }
        return _robotOff!!
    }

private var _robotOff: ImageVector? = null
