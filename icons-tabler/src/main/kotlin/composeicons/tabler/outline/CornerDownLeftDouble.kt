package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerDownLeftDouble: ImageVector
    get() {
        if (_cornerDownLeftDouble != null) return _cornerDownLeftDouble!!
        _cornerDownLeftDouble = tablerOutlineIcon(
            name = "CornerDownLeftDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5v6c0 1.657-1.343 3-3 3h-7")
            addPathData("M13 10 9 14l4 4M8 10 4 14l4 4")
        }
        return _cornerDownLeftDouble!!
    }

private var _cornerDownLeftDouble: ImageVector? = null
