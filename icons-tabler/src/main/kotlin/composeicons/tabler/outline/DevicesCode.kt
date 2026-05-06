package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesCode: ImageVector
    get() {
        if (_devicesCode != null) return _devicesCode!!
        _devicesCode = tablerOutlineIcon(
            name = "DevicesCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 15.5v-6.5c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v4M21 19c0 .552-.448 1-1 1")
            addPathData("M18 8v-3C18 4.448 17.552 4 17 4h-13C3.448 4 3 4.448 3 5v12c0 .552 .448 1 1 1h7")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
            addPathData("M16 9h2")
        }
        return _devicesCode!!
    }

private var _devicesCode: ImageVector? = null
