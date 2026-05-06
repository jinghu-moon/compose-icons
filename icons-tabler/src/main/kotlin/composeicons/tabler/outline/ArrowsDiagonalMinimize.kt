package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDiagonalMinimize: ImageVector
    get() {
        if (_arrowsDiagonalMinimize != null) return _arrowsDiagonalMinimize!!
        _arrowsDiagonalMinimize = tablerOutlineIcon(
            name = "ArrowsDiagonalMinimize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 10h4v-4")
            addPathData("M4 4l6 6")
            addPathData("M18 14h-4v4")
            addPathData("M14 14l6 6")
        }
        return _arrowsDiagonalMinimize!!
    }

private var _arrowsDiagonalMinimize: ImageVector? = null
