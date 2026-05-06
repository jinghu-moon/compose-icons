package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BackpackOff: ImageVector
    get() {
        if (_backpackOff != null) return _backpackOff!!
        _backpackOff = tablerOutlineIcon(
            name = "BackpackOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h3c3.314 0 6 2.686 6 6v3M18.871 18.872C18.487 20.136 17.321 21 16 21h-8C6.343 21 5 19.657 5 18v-6C4.998 10.162 5.841 8.425 7.285 7.288")
            addPathData("M10 6v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v1")
            addPathData("M9 21v-4c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v4")
            addPathData("M3 3 21 21")
        }
        return _backpackOff!!
    }

private var _backpackOff: ImageVector? = null
