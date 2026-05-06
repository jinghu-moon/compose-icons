package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DoorOff: ImageVector
    get() {
        if (_doorOff != null) return _doorOff!!
        _doorOff = tablerOutlineIcon(
            name = "DoorOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M6 21v-15")
            addPathData("M7.18 3.175C7.43 3.063 7.708 3 8 3h8c1.105 0 2 .895 2 2v9")
            addPathData("M18 18v3")
            addPathData("M3 3 21 21")
        }
        return _doorOff!!
    }

private var _doorOff: ImageVector? = null
