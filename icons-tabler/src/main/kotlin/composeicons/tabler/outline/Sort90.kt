package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sort90: ImageVector
    get() {
        if (_sort90 != null) return _sort90!!
        _sort90 = tablerOutlineIcon(
            name = "Sort90",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C8 8.448 7.552 8 7 8h-2C4.448 8 4 8.448 4 9v2c0 .552 .448 1 1 1h3")
            addPathData("M16 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C20 8.895 19.105 8 18 8c-1.105 0-2 .895-2 2")
            addPathData("M11 12h2")
        }
        return _sort90!!
    }

private var _sort90: ImageVector? = null
