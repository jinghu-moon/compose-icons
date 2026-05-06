package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QrcodeOff: ImageVector
    get() {
        if (_qrcodeOff != null) return _qrcodeOff!!
        _qrcodeOff = tablerOutlineIcon(
            name = "QrcodeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h1c.552 0 1 .448 1 1v1M9.703 9.711C9.516 9.896 9.263 10 9 10h-4C4.448 10 4 9.552 4 9v-4c0-.275 .11-.524 .29-.705")
            addPathData("M7 17v.01")
            addPathData("M14 5c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4")
            addPathData("M7 7v.01")
            addPathData("M4 15c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-4")
            addPathData("M17 7v.01")
            addPathData("M20 14v.01")
            addPathData("M14 14v3")
            addPathData("M14 20h3")
            addPathData("M3 3 21 21")
        }
        return _qrcodeOff!!
    }

private var _qrcodeOff: ImageVector? = null
