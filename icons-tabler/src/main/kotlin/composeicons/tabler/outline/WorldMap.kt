package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldMap: ImageVector
    get() {
        if (_worldMap != null) return _worldMap!!
        _worldMap = tablerOutlineIcon(
            name = "WorldMap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 8h-2c-1.105 0-2 .895-2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-1C12 7.895 11.105 7 10 7h-1C7.895 7 7 6.105 7 5v-.5")
            addPathData("M3 12h3c1.105 0 2 .895 2 2v.5C8 15.328 8.672 16 9.5 16c.828 0 1.5 .672 1.5 1.5v3.25")
            addPathData("M15 20.5v-3.5c0-1.105 .895-2 2-2h3.5")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _worldMap!!
    }

private var _worldMap: ImageVector? = null
