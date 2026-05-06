package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DirectionArrows: ImageVector
    get() {
        if (_directionArrows != null) return _directionArrows!!
        _directionArrows = tablerOutlineIcon(
            name = "DirectionArrows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M8 11 7 12l1 1")
            addPathData("M11 8 12 7l1 1")
            addPathData("M16 11l1 1-1 1")
            addPathData("M11 16l1 1 1-1")
        }
        return _directionArrows!!
    }

private var _directionArrows: ImageVector? = null
