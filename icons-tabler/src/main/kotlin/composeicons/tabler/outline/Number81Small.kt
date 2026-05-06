package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number81Small: ImageVector
    get() {
        if (_number81Small != null) return _number81Small!!
        _number81Small = tablerOutlineIcon(
            name = "Number81Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h1v8")
            addPathData("M9 12h-1C7.448 12 7 11.552 7 11v-2C7 8.448 7.448 8 8 8h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1")
        }
        return _number81Small!!
    }

private var _number81Small: ImageVector? = null
