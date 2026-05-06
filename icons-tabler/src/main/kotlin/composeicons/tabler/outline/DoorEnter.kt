package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DoorEnter: ImageVector
    get() {
        if (_doorEnter != null) return _doorEnter!!
        _doorEnter = tablerOutlineIcon(
            name = "DoorEnter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12v.01")
            addPathData("M3 21h18")
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h6M17 13.5v7.5")
            addPathData("M21 7h-7M17 4 14 7l3 3")
        }
        return _doorEnter!!
    }

private var _doorEnter: ImageVector? = null
