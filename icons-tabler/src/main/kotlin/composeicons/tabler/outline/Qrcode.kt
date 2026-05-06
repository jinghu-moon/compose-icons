package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Qrcode: ImageVector
    get() {
        if (_qrcode != null) return _qrcode!!
        _qrcode = tablerOutlineIcon(
            name = "Qrcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 4.448 4.448 4 5 4h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 10 4 9.552 4 9v-4")
            addPathData("M7 17v.01")
            addPathData("M14 5c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4")
            addPathData("M7 7v.01")
            addPathData("M4 15c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-4")
            addPathData("M17 7v.01")
            addPathData("M14 14h3")
            addPathData("M20 14v.01")
            addPathData("M14 14v3")
            addPathData("M14 20h3")
            addPathData("M17 17h3")
            addPathData("M20 17v3")
        }
        return _qrcode!!
    }

private var _qrcode: ImageVector? = null
