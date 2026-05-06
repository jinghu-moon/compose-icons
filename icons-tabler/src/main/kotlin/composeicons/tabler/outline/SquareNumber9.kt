package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareNumber9: ImageVector
    get() {
        if (_squareNumber9 != null) return _squareNumber9!!
        _squareNumber9 = tablerOutlineIcon(
            name = "SquareNumber9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M10 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C14 8.448 13.552 8 13 8h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
        }
        return _squareNumber9!!
    }

private var _squareNumber9: ImageVector? = null
