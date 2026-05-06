package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number93Small: ImageVector
    get() {
        if (_number93Small != null) return _number93Small!!
        _number93Small = tablerOutlineIcon(
            name = "Number93Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8h2.5C17.328 8 18 8.672 18 9.5v1C18 11.328 17.328 12 16.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C18 15.328 17.328 16 16.5 16h-2.5")
            addPathData("M6 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C10 8.448 9.552 8 9 8h-2C6.448 8 6 8.448 6 9v2c0 .552 .448 1 1 1h3")
        }
        return _number93Small!!
    }

private var _number93Small: ImageVector? = null
