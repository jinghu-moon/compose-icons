package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Universe: ImageVector
    get() {
        if (_universe != null) return _universe!!
        _universe = tablerOutlineIcon(
            name = "Universe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.027 11.477c-.289 2.746 1.704 5.206 4.45 5.495 2.746 .289 5.206-1.703 5.495-4.449C17.261 9.776 15.269 7.316 12.523 7.027c-1.076-.117-2.161 .123-3.088 .681")
            addPathData("M5.636 5.636C2.41 8.864 2.111 13.997 4.941 17.578c2.83 3.581 7.892 4.477 11.779 2.085 3.887-2.392 5.368-7.315 3.446-11.455C18.243 4.068 13.527 2.022 9.191 3.448")
            addPathData("M17 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C19 4.448 18.552 4 18 4c-.552 0-1 .448-1 1")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M8 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _universe!!
    }

private var _universe: ImageVector? = null
