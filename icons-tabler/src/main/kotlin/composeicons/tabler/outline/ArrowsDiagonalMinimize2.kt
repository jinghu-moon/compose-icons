package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDiagonalMinimize2: ImageVector
    get() {
        if (_arrowsDiagonalMinimize2 != null) return _arrowsDiagonalMinimize2!!
        _arrowsDiagonalMinimize2 = tablerOutlineIcon(
            name = "ArrowsDiagonalMinimize2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 10h-4v-4")
            addPathData("M20 4l-6 6")
            addPathData("M6 14h4v4")
            addPathData("M10 14 4 20")
        }
        return _arrowsDiagonalMinimize2!!
    }

private var _arrowsDiagonalMinimize2: ImageVector? = null
