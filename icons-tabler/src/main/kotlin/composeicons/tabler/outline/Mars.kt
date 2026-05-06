package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mars: ImageVector
    get() {
        if (_mars != null) return _mars!!
        _mars = tablerOutlineIcon(
            name = "Mars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 14c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C15 11.239 12.761 9 10 9 7.239 9 5 11.239 5 14")
            addPathData("M19 5l-5.4 5.4")
            addPathData("M19 5h-5")
            addPathData("M19 5v5")
        }
        return _mars!!
    }

private var _mars: ImageVector? = null
