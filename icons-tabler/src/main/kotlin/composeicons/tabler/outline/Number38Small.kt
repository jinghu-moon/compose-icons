package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number38Small: ImageVector
    get() {
        if (_number38Small != null) return _number38Small!!
        _number38Small = tablerOutlineIcon(
            name = "Number38Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h-1c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1")
            addPathData("M6 8h2.5C9.328 8 10 8.672 10 9.5v1C10 11.328 9.328 12 8.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C10 15.328 9.328 16 8.5 16h-2.5")
        }
        return _number38Small!!
    }

private var _number38Small: ImageVector? = null
