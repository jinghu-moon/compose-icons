package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTwilio: ImageVector
    get() {
        if (_brandTwilio != null) return _brandTwilio!!
        _brandTwilio = tablerOutlineIcon(
            name = "BrandTwilio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9")
            addPathData("M8 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C10 8.448 9.552 8 9 8 8.448 8 8 8.448 8 9")
            addPathData("M14 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 8.448 15.552 8 15 8c-.552 0-1 .448-1 1")
            addPathData("M14 15c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M8 15c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _brandTwilio!!
    }

private var _brandTwilio: ImageVector? = null
