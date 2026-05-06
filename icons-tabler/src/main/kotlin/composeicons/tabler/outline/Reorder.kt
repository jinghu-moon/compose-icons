package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Reorder: ImageVector
    get() {
        if (_reorder != null) return _reorder!!
        _reorder = tablerOutlineIcon(
            name = "Reorder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 19 3 18.552 3 18v-2")
            addPathData("M10 16c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M17 16c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M5 11v-3C5 6.343 6.343 5 8 5h8c1.657 0 3 1.343 3 3v3")
            addPathData("M16.5 8.5 19 11 21.5 8.5")
        }
        return _reorder!!
    }

private var _reorder: ImageVector? = null
