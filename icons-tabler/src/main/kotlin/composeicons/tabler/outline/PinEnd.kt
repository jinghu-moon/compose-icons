package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PinEnd: ImageVector
    get() {
        if (_pinEnd != null) return _pinEnd!!
        _pinEnd = tablerOutlineIcon(
            name = "PinEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 11v-5C21 5.448 20.552 5 20 5h-16C3.448 5 3 5.448 3 6v12c0 .552 .448 1 1 1h9")
            addPathData("M17 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M10 13v-4h4")
            addPathData("M14 13 10 9")
        }
        return _pinEnd!!
    }

private var _pinEnd: ImageVector? = null
