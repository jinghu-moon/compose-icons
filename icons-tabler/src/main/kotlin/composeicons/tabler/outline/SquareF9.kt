package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareF9: ImageVector
    get() {
        if (_squareF9 != null) return _squareF9!!
        _squareF9 = tablerOutlineIcon(
            name = "SquareF9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M13 14.25c0 .414 .336 .75 .75 .75h1.5c.414 0 .75-.336 .75-.75v-4.5C16 9.336 15.664 9 15.25 9h-1.5C13.336 9 13 9.336 13 9.75v1.5c0 .414 .336 .75 .75 .75h2.25")
            addPathData("M8 12h2")
            addPathData("M10 9h-2v6")
        }
        return _squareF9!!
    }

private var _squareF9: ImageVector? = null
