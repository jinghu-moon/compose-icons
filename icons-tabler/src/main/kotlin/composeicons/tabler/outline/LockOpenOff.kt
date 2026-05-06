package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockOpenOff: ImageVector
    get() {
        if (_lockOpenOff != null) return _lockOpenOff!!
        _lockOpenOff = tablerOutlineIcon(
            name = "LockOpenOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11h2c1.105 0 2 .895 2 2v2M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-6c0-1.105 .895-2 2-2h4")
            addPathData("M11 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M8 11v-3M8.347 4.369C9.116 2.644 10.987 1.693 12.834 2.086 14.681 2.48 16.001 4.112 16 6")
            addPathData("M3 3 21 21")
        }
        return _lockOpenOff!!
    }

private var _lockOpenOff: ImageVector? = null
