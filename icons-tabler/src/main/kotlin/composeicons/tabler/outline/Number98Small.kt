package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number98Small: ImageVector
    get() {
        if (_number98Small != null) return _number98Small!!
        _number98Small = tablerOutlineIcon(
            name = "Number98Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h-1c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1")
            addPathData("M6 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C10 8.448 9.552 8 9 8h-2C6.448 8 6 8.448 6 9v2c0 .552 .448 1 1 1h3")
        }
        return _number98Small!!
    }

private var _number98Small: ImageVector? = null
