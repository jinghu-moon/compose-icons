package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsRight: ImageVector
    get() {
        if (_arrowsRight != null) return _arrowsRight!!
        _arrowsRight = tablerOutlineIcon(
            name = "ArrowsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17h-18")
            addPathData("M18 4l3 3-3 3")
            addPathData("M18 20l3-3L18 14")
            addPathData("M21 7h-18")
        }
        return _arrowsRight!!
    }

private var _arrowsRight: ImageVector? = null
