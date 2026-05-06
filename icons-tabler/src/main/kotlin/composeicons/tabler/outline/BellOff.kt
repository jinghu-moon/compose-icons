package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellOff: ImageVector
    get() {
        if (_bellOff != null) return _bellOff!!
        _bellOff = tablerOutlineIcon(
            name = "BellOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.346 5.353C9.556 5.224 9.774 5.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v3M17 17h-13c1.105-.626 1.847-1.739 2-3v-3C6.062 9.668 6.504 8.382 7.273 7.293")
            addPathData("M9 17v1c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-1")
            addPathData("M3 3 21 21")
        }
        return _bellOff!!
    }

private var _bellOff: ImageVector? = null
