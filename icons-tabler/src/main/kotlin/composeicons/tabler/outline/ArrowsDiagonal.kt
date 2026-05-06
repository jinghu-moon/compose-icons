package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDiagonal: ImageVector
    get() {
        if (_arrowsDiagonal != null) return _arrowsDiagonal!!
        _arrowsDiagonal = tablerOutlineIcon(
            name = "ArrowsDiagonal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4h4v4")
            addPathData("M14 10 20 4")
            addPathData("M8 20h-4v-4")
            addPathData("M4 20l6-6")
        }
        return _arrowsDiagonal!!
    }

private var _arrowsDiagonal: ImageVector? = null
