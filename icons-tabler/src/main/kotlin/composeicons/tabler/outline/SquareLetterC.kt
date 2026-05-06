package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareLetterC: ImageVector
    get() {
        if (_squareLetterC != null) return _squareLetterC!!
        _squareLetterC = tablerOutlineIcon(
            name = "SquareLetterC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M14 10C14 8.895 13.105 8 12 8c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
        }
        return _squareLetterC!!
    }

private var _squareLetterC: ImageVector? = null
