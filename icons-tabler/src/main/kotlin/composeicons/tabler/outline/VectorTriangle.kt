package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorTriangle: ImageVector
    get() {
        if (_vectorTriangle != null) return _vectorTriangle!!
        _vectorTriangle = tablerOutlineIcon(
            name = "VectorTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C10.448 8 10 7.552 10 7v-2")
            addPathData("M3 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 21 3 20.552 3 20v-2")
            addPathData("M17 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M6.5 17.1 11.5 8")
            addPathData("M17.5 17.1 12.5 8")
            addPathData("M7 19h10")
        }
        return _vectorTriangle!!
    }

private var _vectorTriangle: ImageVector? = null
