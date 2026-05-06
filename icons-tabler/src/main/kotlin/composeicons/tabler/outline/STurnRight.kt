package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnRight: ImageVector
    get() {
        if (_sTurnRight != null) return _sTurnRight!!
        _sTurnRight = tablerOutlineIcon(
            name = "STurnRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5c0 1.105 .895 2 2 2C6.105 7 7 6.105 7 5 7 3.895 6.105 3 5 3 3.895 3 3 3.895 3 5")
            addPathData("M7 5h9.5C18.433 5 20 6.567 20 8.5 20 10.433 18.433 12 16.5 12h-9C5.567 12 4 13.567 4 15.5 4 17.433 5.567 19 7.5 19h13.5")
            addPathData("M18 16l3 3-3 3")
        }
        return _sTurnRight!!
    }

private var _sTurnRight: ImageVector? = null
