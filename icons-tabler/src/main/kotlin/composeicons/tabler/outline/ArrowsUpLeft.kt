package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsUpLeft: ImageVector
    get() {
        if (_arrowsUpLeft != null) return _arrowsUpLeft!!
        _arrowsUpLeft = tablerOutlineIcon(
            name = "ArrowsUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 7 17 3 13 7")
            addPathData("M17 3v11c0 1.657-1.343 3-3 3h-11")
            addPathData("M7 13 3 17l4 4")
        }
        return _arrowsUpLeft!!
    }

private var _arrowsUpLeft: ImageVector? = null
