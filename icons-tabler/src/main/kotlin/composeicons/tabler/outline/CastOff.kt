package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CastOff: ImageVector
    get() {
        if (_castOff != null) return _castOff!!
        _castOff = tablerOutlineIcon(
            name = "CastOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19h.01")
            addPathData("M7 19C7 16.791 5.209 15 3 15")
            addPathData("M11 19C11 14.582 7.418 11 3 11")
            addPathData("M15 19h3c.296 0 .591-.044 .875-.13M20.875 16.87c.085-.281 .128-.574 .128-.868v-8c0-1.657-1.343-3-3-3h-9M5.138 5.138C4.235 5.42 3.518 6.11 3.203 7.002")
            addPathData("M3 3 21 21")
        }
        return _castOff!!
    }

private var _castOff: ImageVector? = null
