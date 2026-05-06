package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedNumber6: ImageVector
    get() {
        if (_squareRoundedNumber6 != null) return _squareRoundedNumber6!!
        _squareRoundedNumber6 = tablerOutlineIcon(
            name = "SquareRoundedNumber6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9C14 8.448 13.552 8 13 8h-2c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
        }
        return _squareRoundedNumber6!!
    }

private var _squareRoundedNumber6: ImageVector? = null
