package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorBezierArc: ImageVector
    get() {
        if (_vectorBezierArc != null) return _vectorBezierArc!!
        _vectorBezierArc = tablerOutlineIcon(
            name = "VectorBezierArc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 14 3 13.552 3 13v-2")
            addPathData("M17 11c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M10 4c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C10.448 7 10 6.552 10 6v-2")
            addPathData("M10 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M19 10C19 7.239 16.761 5 14 5")
            addPathData("M5 14c0 2.761 2.239 5 5 5")
            addPathData("M5 10C5 7.239 7.239 5 10 5")
        }
        return _vectorBezierArc!!
    }

private var _vectorBezierArc: ImageVector? = null
