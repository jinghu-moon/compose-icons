package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGraphql: ImageVector
    get() {
        if (_brandGraphql != null) return _brandGraphql!!
        _brandGraphql = tablerOutlineIcon(
            name = "BrandGraphql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8 12 3l8 5v8l-8 5L4 16v-8")
            addPathData("M12 4l7.5 12h-15L12 4")
            addPathData("M11 3c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 2.448 12.552 2 12 2c-.552 0-1 .448-1 1")
            addPathData("M11 21c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 8c0 .552 .448 1 1 1C4.552 9 5 8.552 5 8 5 7.448 4.552 7 4 7 3.448 7 3 7.448 3 8")
            addPathData("M3 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1C5 15.448 4.552 15 4 15c-.552 0-1 .448-1 1")
            addPathData("M19 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M19 8c0 .552 .448 1 1 1 .552 0 1-.448 1-1C21 7.448 20.552 7 20 7c-.552 0-1 .448-1 1")
        }
        return _brandGraphql!!
    }

private var _brandGraphql: ImageVector? = null
