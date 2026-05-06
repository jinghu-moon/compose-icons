package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number50Small: ImageVector
    get() {
        if (_number50Small != null) return _number50Small!!
        _number50Small = tablerOutlineIcon(
            name = "Number50Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C18 8.895 17.105 8 16 8c-1.105 0-2 .895-2 2")
            addPathData("M6 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3v-4h4")
        }
        return _number50Small!!
    }

private var _number50Small: ImageVector? = null
