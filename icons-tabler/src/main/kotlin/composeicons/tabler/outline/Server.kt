package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Server: ImageVector
    get() {
        if (_server != null) return _server!!
        _server = tablerOutlineIcon(
            name = "Server",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-12C4.343 12 3 10.657 3 9")
            addPathData("M3 15C3 13.343 4.343 12 6 12h12c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-12C4.343 20 3 18.657 3 17v-2")
            addPathData("M7 8v.01")
            addPathData("M7 16v.01")
        }
        return _server!!
    }

private var _server: ImageVector? = null
