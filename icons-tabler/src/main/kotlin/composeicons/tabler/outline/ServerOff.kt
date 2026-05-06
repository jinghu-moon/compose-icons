package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ServerOff: ImageVector
    get() {
        if (_serverOff != null) return _serverOff!!
        _serverOff = tablerOutlineIcon(
            name = "ServerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h-6C4.343 12 3 10.657 3 9v-2C3 5.917 3.574 4.967 4.435 4.44M8 4h10c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-2")
            addPathData("M16 12h2c1.657 0 3 1.343 3 3v2M19.552 19.568c-.468 .283-1.005 .433-1.552 .432h-12C4.343 20 3 18.657 3 17v-2C3 13.343 4.343 12 6 12h6")
            addPathData("M7 8v.01")
            addPathData("M7 16v.01")
            addPathData("M3 3 21 21")
        }
        return _serverOff!!
    }

private var _serverOff: ImageVector? = null
