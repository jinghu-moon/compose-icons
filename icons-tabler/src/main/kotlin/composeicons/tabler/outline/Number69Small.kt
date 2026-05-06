package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number69Small: ImageVector
    get() {
        if (_number69Small != null) return _number69Small!!
        _number69Small = tablerOutlineIcon(
            name = "Number69Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C18 8.448 17.552 8 17 8h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
            addPathData("M10 9C10 8.448 9.552 8 9 8h-2C6.448 8 6 8.448 6 9v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3")
        }
        return _number69Small!!
    }

private var _number69Small: ImageVector? = null
