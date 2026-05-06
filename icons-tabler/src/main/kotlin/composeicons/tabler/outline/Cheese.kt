package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = tablerOutlineIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.519 20.008 21 20v-3.5c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2v-3.5h-16.722")
            addPathData("M21 9 11.615 4.008C9.103 4.128 6.857 5.428 5.288 7.433 3.865 9.253 3 11.654 3 14.287c0 2.117 .56 4.085 1.519 5.721")
            addPathData("M15 13v.01")
            addPathData("M8 13v.01")
            addPathData("M11 16v.01")
        }
        return _cheese!!
    }

private var _cheese: ImageVector? = null
