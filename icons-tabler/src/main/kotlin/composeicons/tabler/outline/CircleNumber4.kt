package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleNumber4: ImageVector
    get() {
        if (_circleNumber4 != null) return _circleNumber4!!
        _circleNumber4 = tablerOutlineIcon(
            name = "CircleNumber4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10 8v3c0 .552 .448 1 1 1h3")
            addPathData("M14 8v8")
        }
        return _circleNumber4!!
    }

private var _circleNumber4: ImageVector? = null
