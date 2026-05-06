package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NewSection: ImageVector
    get() {
        if (_newSection != null) return _newSection!!
        _newSection = tablerOutlineIcon(
            name = "NewSection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12h6")
            addPathData("M12 9v6")
            addPathData("M4 6v-1C4 4.448 4.448 4 5 4h1M11 4h2M18 4h1c.552 0 1 .448 1 1v1M20 11v2M20 18v1c0 .552-.448 1-1 1h-1M13 20h-2M6 20h-1C4.448 20 4 19.552 4 19v-1M4 13v-2M4 6")
        }
        return _newSection!!
    }

private var _newSection: ImageVector? = null
