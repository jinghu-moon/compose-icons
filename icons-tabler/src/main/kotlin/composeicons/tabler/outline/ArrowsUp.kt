package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsUp: ImageVector
    get() {
        if (_arrowsUp != null) return _arrowsUp!!
        _arrowsUp = tablerOutlineIcon(
            name = "ArrowsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3v18")
            addPathData("M4 6 7 3l3 3")
            addPathData("M20 6 17 3 14 6")
            addPathData("M7 3v18")
        }
        return _arrowsUp!!
    }

private var _arrowsUp: ImageVector? = null
