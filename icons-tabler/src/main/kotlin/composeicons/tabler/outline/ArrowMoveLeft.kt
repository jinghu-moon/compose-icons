package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowMoveLeft: ImageVector
    get() {
        if (_arrowMoveLeft != null) return _arrowMoveLeft!!
        _arrowMoveLeft = tablerOutlineIcon(
            name = "ArrowMoveLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12h-10")
            addPathData("M6 15 3 12 6 9")
            addPathData("M17 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2")
        }
        return _arrowMoveLeft!!
    }

private var _arrowMoveLeft: ImageVector? = null
