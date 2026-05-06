package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnUp: ImageVector
    get() {
        if (_sTurnUp != null) return _sTurnUp!!
        _sTurnUp = tablerOutlineIcon(
            name = "STurnUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 19C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M5 17v-9.5C5 5.567 6.567 4 8.5 4 10.433 4 12 5.567 12 7.5v9C12 18.433 13.567 20 15.5 20 17.433 20 19 18.433 19 16.5v-13.5")
            addPathData("M16 6 19 3l3 3")
        }
        return _sTurnUp!!
    }

private var _sTurnUp: ImageVector? = null
