package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquarePercentage: ImageVector
    get() {
        if (_squarePercentage != null) return _squarePercentage!!
        _squarePercentage = tablerOutlineIcon(
            name = "SquarePercentage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M9 15.037l6-6")
            addPathData("M9 9.068v.014")
            addPathData("M15 15.082v.016")
        }
        return _squarePercentage!!
    }

private var _squarePercentage: ImageVector? = null
