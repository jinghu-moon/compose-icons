package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowForwardUpDouble: ImageVector
    get() {
        if (_arrowForwardUpDouble != null) return _arrowForwardUpDouble!!
        _arrowForwardUpDouble = tablerOutlineIcon(
            name = "ArrowForwardUpDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 14l4-4L11 6")
            addPathData("M16 14l4-4L16 6")
            addPathData("M15 10h-7C5.791 10 4 11.791 4 14c0 2.209 1.791 4 4 4h1")
        }
        return _arrowForwardUpDouble!!
    }

private var _arrowForwardUpDouble: ImageVector? = null
