package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowMoveRight: ImageVector
    get() {
        if (_arrowMoveRight != null) return _arrowMoveRight!!
        _arrowMoveRight = tablerOutlineIcon(
            name = "ArrowMoveRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12h10")
            addPathData("M18 9l3 3-3 3")
            addPathData("M7 12c0 1.105-.895 2-2 2C3.895 14 3 13.105 3 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
        }
        return _arrowMoveRight!!
    }

private var _arrowMoveRight: ImageVector? = null
