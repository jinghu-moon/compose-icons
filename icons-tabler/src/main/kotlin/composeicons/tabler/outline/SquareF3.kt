package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareF3: ImageVector
    get() {
        if (_squareF3 != null) return _squareF3!!
        _squareF3 = tablerOutlineIcon(
            name = "SquareF3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M13 9.5C13 9.224 13.224 9 13.5 9h1C15.328 9 16 9.672 16 10.5 16 11.328 15.328 12 14.5 12h-.5 .5c.828 0 1.5 .672 1.5 1.5C16 14.328 15.328 15 14.5 15h-1C13.224 15 13 14.776 13 14.5")
            addPathData("M8 12h2")
            addPathData("M10 9h-2v6")
        }
        return _squareF3!!
    }

private var _squareF3: ImageVector? = null
