package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleNumber2: ImageVector
    get() {
        if (_circleNumber2 != null) return _circleNumber2!!
        _circleNumber2 = tablerOutlineIcon(
            name = "CircleNumber2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10 8h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
        }
        return _circleNumber2!!
    }

private var _circleNumber2: ImageVector? = null
