package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRightSquare: ImageVector
    get() {
        if (_arrowRightSquare != null) return _arrowRightSquare!!
        _arrowRightSquare = tablerOutlineIcon(
            name = "ArrowRightSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12h14")
            addPathData("M18 15l3-3L18 9")
            addPathData("M3 10h4v4h-4v-4")
        }
        return _arrowRightSquare!!
    }

private var _arrowRightSquare: ImageVector? = null
