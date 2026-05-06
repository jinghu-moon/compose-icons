package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = tablerOutlineIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 17v-11.5")
            addPathData("M7 10v3l5 3")
            addPathData("M12 14.5l5-2v-2.5")
            addPathData("M16 10h2v-2h-2v2")
            addPathData("M6 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C8 8.448 7.552 8 7 8 6.448 8 6 8.448 6 9")
            addPathData("M10 5.5h4L12 3 10 5.5")
        }
        return _usb!!
    }

private var _usb: ImageVector? = null
