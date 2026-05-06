package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number29Small: ImageVector
    get() {
        if (_number29Small != null) return _number29Small!!
        _number29Small = tablerOutlineIcon(
            name = "Number29Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C18 8.448 17.552 8 17 8h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
            addPathData("M6 8h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
        }
        return _number29Small!!
    }

private var _number29Small: ImageVector? = null
