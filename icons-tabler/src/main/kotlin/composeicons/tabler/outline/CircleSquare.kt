package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleSquare: ImageVector
    get() {
        if (_circleSquare != null) return _circleSquare!!
        _circleSquare = tablerOutlineIcon(
            name = "CircleSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9.5C3 13.09 5.91 16 9.5 16 13.09 16 16 13.09 16 9.5 16 5.91 13.09 3 9.5 3 5.91 3 3 5.91 3 9.5")
            addPathData("M10 12c0-1.105 .895-2 2-2h7c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-7c-1.105 0-2-.895-2-2v-7")
        }
        return _circleSquare!!
    }

private var _circleSquare: ImageVector? = null
