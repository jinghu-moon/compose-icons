package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RippleOff: ImageVector
    get() {
        if (_rippleOff != null) return _rippleOff!!
        _rippleOff = tablerOutlineIcon(
            name = "RippleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3.915 6.39 4.83 5.966 5.746 5.728M9.958 5.948C10.638 6.195 11.319 6.546 12 7c3 2 6 2 9 0")
            addPathData("M3 17c3-2 6-2 9 0 2.092 1.395 4.184 1.817 6.276 1.266")
            addPathData("M3 12c3-2 6-2 9 0M17.482 13.429C18.655 13.258 19.827 12.782 21 12")
            addPathData("M3 3 21 21")
        }
        return _rippleOff!!
    }

private var _rippleOff: ImageVector? = null
