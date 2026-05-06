package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRoundaboutLeft: ImageVector
    get() {
        if (_arrowRoundaboutLeft != null) return _arrowRoundaboutLeft!!
        _arrowRoundaboutLeft = tablerOutlineIcon(
            name = "ArrowRoundaboutLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9h8C11 6.239 13.239 4 16 4c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5v7")
            addPathData("M7 5 3 9l4 4")
        }
        return _arrowRoundaboutLeft!!
    }

private var _arrowRoundaboutLeft: ImageVector? = null
