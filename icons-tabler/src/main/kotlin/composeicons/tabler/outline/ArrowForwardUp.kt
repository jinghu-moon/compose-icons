package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowForwardUp: ImageVector
    get() {
        if (_arrowForwardUp != null) return _arrowForwardUp!!
        _arrowForwardUp = tablerOutlineIcon(
            name = "ArrowForwardUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 14l4-4L15 6")
            addPathData("M19 10h-11C5.791 10 4 11.791 4 14c0 2.209 1.791 4 4 4h1")
        }
        return _arrowForwardUp!!
    }

private var _arrowForwardUp: ImageVector? = null
