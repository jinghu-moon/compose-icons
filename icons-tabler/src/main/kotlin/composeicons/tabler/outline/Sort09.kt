package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sort09: ImageVector
    get() {
        if (_sort09 != null) return _sort09!!
        _sort09 = tablerOutlineIcon(
            name = "Sort09",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12h2")
            addPathData("M4 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M16 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C20 8.448 19.552 8 19 8h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
        }
        return _sort09!!
    }

private var _sort09: ImageVector? = null
