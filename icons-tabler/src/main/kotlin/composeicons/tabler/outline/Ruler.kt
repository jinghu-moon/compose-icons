package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = tablerOutlineIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4h14c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-7c-.552 0-1 .448-1 1v7c0 .552-.448 1-1 1h-5C4.448 20 4 19.552 4 19v-14C4 4.448 4.448 4 5 4")
            addPathData("M4 8h2")
            addPathData("M4 12h3")
            addPathData("M4 16h2")
            addPathData("M8 4v2")
            addPathData("M12 4v3")
            addPathData("M16 4v2")
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
