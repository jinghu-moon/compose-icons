package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDiagonal2: ImageVector
    get() {
        if (_arrowsDiagonal2 != null) return _arrowsDiagonal2!!
        _arrowsDiagonal2 = tablerOutlineIcon(
            name = "ArrowsDiagonal2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 20h4v-4")
            addPathData("M14 14l6 6")
            addPathData("M8 4h-4v4")
            addPathData("M4 4l6 6")
        }
        return _arrowsDiagonal2!!
    }

private var _arrowsDiagonal2: ImageVector? = null
