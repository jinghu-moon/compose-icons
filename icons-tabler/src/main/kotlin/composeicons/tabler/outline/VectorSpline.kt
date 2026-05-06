package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorSpline: ImageVector
    get() {
        if (_vectorSpline != null) return _vectorSpline!!
        _vectorSpline = tablerOutlineIcon(
            name = "VectorSpline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C17.448 7 17 6.552 17 6v-2")
            addPathData("M3 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 21 3 20.552 3 20v-2")
            addPathData("M17 5C10.373 5 5 10.373 5 17")
        }
        return _vectorSpline!!
    }

private var _vectorSpline: ImageVector? = null
