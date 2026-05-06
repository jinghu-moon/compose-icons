package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number63Small: ImageVector
    get() {
        if (_number63Small != null) return _number63Small!!
        _number63Small = tablerOutlineIcon(
            name = "Number63Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8h2.5C17.328 8 18 8.672 18 9.5v1C18 11.328 17.328 12 16.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C18 15.328 17.328 16 16.5 16h-2.5")
            addPathData("M10 9C10 8.448 9.552 8 9 8h-2C6.448 8 6 8.448 6 9v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3")
        }
        return _number63Small!!
    }

private var _number63Small: ImageVector? = null
