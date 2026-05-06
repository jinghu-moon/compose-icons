package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesPlus: ImageVector
    get() {
        if (_devicesPlus != null) return _devicesPlus!!
        _devicesPlus = tablerOutlineIcon(
            name = "DevicesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16.5v-7.5c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3.5")
            addPathData("M18 8v-3C18 4.448 17.552 4 17 4h-13C3.448 4 3 4.448 3 5v12c0 .552 .448 1 1 1h8")
            addPathData("M16 9h2")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _devicesPlus!!
    }

private var _devicesPlus: ImageVector? = null
