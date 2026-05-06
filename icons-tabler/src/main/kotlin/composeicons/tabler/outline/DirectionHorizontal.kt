package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DirectionHorizontal: ImageVector
    get() {
        if (_directionHorizontal != null) return _directionHorizontal!!
        _directionHorizontal = tablerOutlineIcon(
            name = "DirectionHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9 7 12l3 3")
            addPathData("M14 9l3 3-3 3")
        }
        return _directionHorizontal!!
    }

private var _directionHorizontal: ImageVector? = null
