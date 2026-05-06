package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = tablerOutlineIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M4 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 15.895 7.105 15 6 15c-1.105 0-2 .895-2 2")
            addPathData("M8 17h5c.403-2.576 2.424-4.597 5-5v-5C18 5.895 17.105 5 16 5h-1")
        }
        return _scooter!!
    }

private var _scooter: ImageVector? = null
