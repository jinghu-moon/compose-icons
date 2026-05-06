package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRoundaboutRight: ImageVector
    get() {
        if (_arrowRoundaboutRight != null) return _arrowRoundaboutRight!!
        _arrowRoundaboutRight = tablerOutlineIcon(
            name = "ArrowRoundaboutRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 9h-8C13 6.239 10.761 4 8 4 5.239 4 3 6.239 3 9c0 2.761 2.239 5 5 5v7")
            addPathData("M17 5l4 4-4 4")
        }
        return _arrowRoundaboutRight!!
    }

private var _arrowRoundaboutRight: ImageVector? = null
