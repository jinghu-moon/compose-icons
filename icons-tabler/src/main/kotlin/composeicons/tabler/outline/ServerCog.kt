package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ServerCog: ImageVector
    get() {
        if (_serverCog != null) return _serverCog!!
        _serverCog = tablerOutlineIcon(
            name = "ServerCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-12C4.343 12 3 10.657 3 9v-2")
            addPathData("M12 20h-6C4.343 20 3 18.657 3 17v-2C3 13.343 4.343 12 6 12h10.5")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M18 14.5v1.5")
            addPathData("M18 20v1.5")
            addPathData("M21.032 16.25 19.733 17")
            addPathData("M16.27 19l-1.3 .75")
            addPathData("M14.97 16.25 16.27 17")
            addPathData("M19.733 19l1.3 .75")
            addPathData("M7 8v.01")
            addPathData("M7 16v.01")
        }
        return _serverCog!!
    }

private var _serverCog: ImageVector? = null
