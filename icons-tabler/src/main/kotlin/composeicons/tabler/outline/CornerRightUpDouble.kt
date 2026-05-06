package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerRightUpDouble: ImageVector
    get() {
        if (_cornerRightUpDouble != null) return _cornerRightUpDouble!!
        _cornerRightUpDouble = tablerOutlineIcon(
            name = "CornerRightUpDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 19h6c1.657 0 3-1.343 3-3v-7")
            addPathData("M10 13 14 9l4 4M10 8 14 4l4 4")
        }
        return _cornerRightUpDouble!!
    }

private var _cornerRightUpDouble: ImageVector? = null
