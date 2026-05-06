package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerRightDownDouble: ImageVector
    get() {
        if (_cornerRightDownDouble != null) return _cornerRightDownDouble!!
        _cornerRightDownDouble = tablerOutlineIcon(
            name = "CornerRightDownDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4h6c1.657 0 3 1.343 3 3v7")
            addPathData("M10 10l4 4 4-4M10 15l4 4 4-4")
        }
        return _cornerRightDownDouble!!
    }

private var _cornerRightDownDouble: ImageVector? = null
