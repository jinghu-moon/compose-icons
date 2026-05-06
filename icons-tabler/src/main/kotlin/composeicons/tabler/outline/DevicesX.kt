package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesX: ImageVector
    get() {
        if (_devicesX != null) return _devicesX!!
        _devicesX = tablerOutlineIcon(
            name = "DevicesX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 20c-.552 0-1-.448-1-1v-10c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v4")
            addPathData("M18 8v-3C18 4.448 17.552 4 17 4h-13C3.448 4 3 4.448 3 5v12c0 .552 .448 1 1 1h9")
            addPathData("M16 9h2")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _devicesX!!
    }

private var _devicesX: ImageVector? = null
