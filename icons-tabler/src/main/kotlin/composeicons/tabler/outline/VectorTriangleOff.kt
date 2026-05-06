package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorTriangleOff: ImageVector
    get() {
        if (_vectorTriangleOff != null) return _vectorTriangleOff!!
        _vectorTriangleOff = tablerOutlineIcon(
            name = "VectorTriangleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6v-1c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-1")
            addPathData("M3 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 21 3 20.552 3 20v-2")
            addPathData("M20.705 20.709c-.187 .186-.441 .291-.705 .291h-2c-.552 0-1-.448-1-1v-2c0-.28 .115-.532 .3-.714")
            addPathData("M6.5 17.1l3.749-6.823")
            addPathData("M13.158 9.197 12.5 8")
            addPathData("M7 19h10")
            addPathData("M3 3 21 21")
        }
        return _vectorTriangleOff!!
    }

private var _vectorTriangleOff: ImageVector? = null
