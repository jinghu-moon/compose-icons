package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedNumber9: ImageVector
    get() {
        if (_squareRoundedNumber9 != null) return _squareRoundedNumber9!!
        _squareRoundedNumber9 = tablerOutlineIcon(
            name = "SquareRoundedNumber9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C14 8.448 13.552 8 13 8h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
        }
        return _squareRoundedNumber9!!
    }

private var _squareRoundedNumber9: ImageVector? = null
