package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorBezier: ImageVector
    get() {
        if (_vectorBezier != null) return _vectorBezier!!
        _vectorBezier = tablerOutlineIcon(
            name = "VectorBezier",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 18 3 17.552 3 17v-2")
            addPathData("M17 15c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M10 7c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M10 8.5C7.262 8.956 5.194 11.231 5 14")
            addPathData("M14 8.5c2.738 .456 4.806 2.731 5 5.5")
            addPathData("M10 8h-6")
            addPathData("M20 8h-6")
            addPathData("M2 8c0 .552 .448 1 1 1C3.552 9 4 8.552 4 8 4 7.448 3.552 7 3 7 2.448 7 2 7.448 2 8")
            addPathData("M20 8c0 .552 .448 1 1 1 .552 0 1-.448 1-1C22 7.448 21.552 7 21 7c-.552 0-1 .448-1 1")
        }
        return _vectorBezier!!
    }

private var _vectorBezier: ImageVector? = null
