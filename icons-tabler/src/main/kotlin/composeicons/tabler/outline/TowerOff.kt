package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TowerOff: ImageVector
    get() {
        if (_towerOff != null) return _towerOff!!
        _towerOff = tablerOutlineIcon(
            name = "TowerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6v-2c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2h3v-2c0-.552 .448-1 1-1h1c.552 0 1 .448 1 1v4.394c0 .395-.117 .781-.336 1.11l-1.328 1.992c-.219 .329-.336 .715-.336 1.11v1.394M18 18v2c0 .552-.448 1-1 1h-10C6.448 21 6 20.552 6 20v-7.394c0-.395-.117-.781-.336-1.11L4.336 9.504C4.117 9.175 4 8.789 4 8.394v-4.394")
            addPathData("M10 21v-5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v5")
            addPathData("M3 3 21 21")
        }
        return _towerOff!!
    }

private var _towerOff: ImageVector? = null
