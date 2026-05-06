package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number19Small: ImageVector
    get() {
        if (_number19Small != null) return _number19Small!!
        _number19Small = tablerOutlineIcon(
            name = "Number19Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h1v8")
            addPathData("M13 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C17 8.448 16.552 8 16 8h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
        }
        return _number19Small!!
    }

private var _number19Small: ImageVector? = null
