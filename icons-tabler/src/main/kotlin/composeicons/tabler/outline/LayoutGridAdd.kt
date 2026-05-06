package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutGridAdd: ImageVector
    get() {
        if (_layoutGridAdd != null) return _layoutGridAdd!!
        _layoutGridAdd = tablerOutlineIcon(
            name = "LayoutGridAdd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 4.448 4.448 4 5 4h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 10 4 9.552 4 9v-4")
            addPathData("M14 5c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4")
            addPathData("M4 15c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-4")
            addPathData("M14 17h6M17 14v6")
        }
        return _layoutGridAdd!!
    }

private var _layoutGridAdd: ImageVector? = null
