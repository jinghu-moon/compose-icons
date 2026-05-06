package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorBezier2: ImageVector
    get() {
        if (_vectorBezier2 != null) return _vectorBezier2!!
        _vectorBezier2 = tablerOutlineIcon(
            name = "VectorBezier2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4C3 3.448 3.448 3 4 3h2c.552 0 1 .448 1 1v2C7 6.552 6.552 7 6 7h-2C3.448 7 3 6.552 3 6v-2")
            addPathData("M17 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M7 5h7")
            addPathData("M10 19h7")
            addPathData("M8 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M14 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 4.448 15.552 4 15 4c-.552 0-1 .448-1 1")
            addPathData("M7 5.5c2.761 0 5 2.91 5 6.5 0 3.59 2.239 6.5 5 6.5")
        }
        return _vectorBezier2!!
    }

private var _vectorBezier2: ImageVector? = null
