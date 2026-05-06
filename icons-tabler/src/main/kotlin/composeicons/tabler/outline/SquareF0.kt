package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareF0: ImageVector
    get() {
        if (_squareF0 != null) return _squareF0!!
        _squareF0 = tablerOutlineIcon(
            name = "SquareF0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M13 10.5v3c0 .828 .672 1.5 1.5 1.5C15.328 15 16 14.328 16 13.5v-3C16 9.672 15.328 9 14.5 9 13.672 9 13 9.672 13 10.5")
            addPathData("M8 12h2")
            addPathData("M10 9h-2v6")
        }
        return _squareF0!!
    }

private var _squareF0: ImageVector? = null
