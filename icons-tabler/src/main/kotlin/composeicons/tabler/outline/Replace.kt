package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Replace: ImageVector
    get() {
        if (_replace != null) return _replace!!
        _replace = tablerOutlineIcon(
            name = "Replace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4C3 3.448 3.448 3 4 3h4c.552 0 1 .448 1 1v4C9 8.552 8.552 9 8 9h-4C3.448 9 3 8.552 3 8v-4")
            addPathData("M15 16c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4")
            addPathData("M21 11v-3C21 6.895 20.105 6 19 6h-6l3 3M16 3 13 6")
            addPathData("M3 13v3c0 1.105 .895 2 2 2h6L8 15M8 21l3-3")
        }
        return _replace!!
    }

private var _replace: ImageVector? = null
