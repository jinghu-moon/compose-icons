package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PaintOff: ImageVector
    get() {
        if (_paintOff != null) return _paintOff!!
        _paintOff = tablerOutlineIcon(
            name = "PaintOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-4M9 9h-2C5.895 9 5 8.105 5 7v-2")
            addPathData("M19 6h1c1.105 0 2 .895 2 2 0 2.761-2.239 5-5 5M13 13h-1v2")
            addPathData("M10 16c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-4")
            addPathData("M3 3 21 21")
        }
        return _paintOff!!
    }

private var _paintOff: ImageVector? = null
