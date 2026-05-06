package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DoorExit: ImageVector
    get() {
        if (_doorExit != null) return _doorExit!!
        _doorExit = tablerOutlineIcon(
            name = "DoorExit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12v.01")
            addPathData("M3 21h18")
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h7.5M17 13.5v7.5")
            addPathData("M14 7h7M18 4l3 3-3 3")
        }
        return _doorExit!!
    }

private var _doorExit: ImageVector? = null
