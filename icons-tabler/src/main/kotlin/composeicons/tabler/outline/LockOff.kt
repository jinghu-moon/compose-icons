package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockOff: ImageVector
    get() {
        if (_lockOff != null) return _lockOff!!
        _lockOff = tablerOutlineIcon(
            name = "LockOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11h2c1.105 0 2 .895 2 2v2M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-6c0-1.105 .895-2 2-2h4")
            addPathData("M11 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M8 11v-3M8.719 4.711C9.719 3.278 11.533 2.659 13.2 3.183 14.867 3.707 16 5.253 16 7v4")
            addPathData("M3 3 21 21")
        }
        return _lockOff!!
    }

private var _lockOff: ImageVector? = null
