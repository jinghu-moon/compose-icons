package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesExclamation: ImageVector
    get() {
        if (_devicesExclamation != null) return _devicesExclamation!!
        _devicesExclamation = tablerOutlineIcon(
            name = "DevicesExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 20h-1c-.552 0-1-.448-1-1v-10c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3.5")
            addPathData("M18 8v-3C18 4.448 17.552 4 17 4h-13C3.448 4 3 4.448 3 5v12c0 .552 .448 1 1 1h9")
            addPathData("M16 9h2")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _devicesExclamation!!
    }

private var _devicesExclamation: ImageVector? = null
