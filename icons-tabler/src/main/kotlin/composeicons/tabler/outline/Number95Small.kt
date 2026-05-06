package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number95Small: ImageVector
    get() {
        if (_number95Small != null) return _number95Small!!
        _number95Small = tablerOutlineIcon(
            name = "Number95Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3v-4h4")
            addPathData("M6 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C10 8.448 9.552 8 9 8h-2C6.448 8 6 8.448 6 9v2c0 .552 .448 1 1 1h3")
        }
        return _number95Small!!
    }

private var _number95Small: ImageVector? = null
