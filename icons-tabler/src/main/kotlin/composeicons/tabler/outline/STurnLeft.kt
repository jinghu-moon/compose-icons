package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnLeft: ImageVector
    get() {
        if (_sTurnLeft != null) return _sTurnLeft!!
        _sTurnLeft = tablerOutlineIcon(
            name = "STurnLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 7C17.895 7 17 6.105 17 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2")
            addPathData("M17 5h-9.5C5.567 5 4 6.567 4 8.5 4 10.433 5.567 12 7.5 12h9C18.433 12 20 13.567 20 15.5 20 17.433 18.433 19 16.5 19h-13.5")
            addPathData("M6 16 3 19l3 3")
        }
        return _sTurnLeft!!
    }

private var _sTurnLeft: ImageVector? = null
