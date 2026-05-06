package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHbo: ImageVector
    get() {
        if (_brandHbo != null) return _brandHbo!!
        _brandHbo = tablerOutlineIcon(
            name = "BrandHbo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 16v-8")
            addPathData("M6 8v8")
            addPathData("M2 12h4")
            addPathData("M9 16h2c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-2 2c1.105 0 2-.895 2-2C13 8.895 12.105 8 11 8h-2v8")
            addPathData("M19 8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C15 9.791 16.791 8 19 8")
            addPathData("M18 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _brandHbo!!
    }

private var _brandHbo: ImageVector? = null
