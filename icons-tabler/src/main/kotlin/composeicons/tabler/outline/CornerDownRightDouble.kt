package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerDownRightDouble: ImageVector
    get() {
        if (_cornerDownRightDouble != null) return _cornerDownRightDouble!!
        _cornerDownRightDouble = tablerOutlineIcon(
            name = "CornerDownRightDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5v6c0 1.657 1.343 3 3 3h7")
            addPathData("M10 10l4 4-4 4M15 10l4 4-4 4")
        }
        return _cornerDownRightDouble!!
    }

private var _cornerDownRightDouble: ImageVector? = null
