package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number90Small: ImageVector
    get() {
        if (_number90Small != null) return _number90Small!!
        _number90Small = tablerOutlineIcon(
            name = "Number90Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C18 8.895 17.105 8 16 8c-1.105 0-2 .895-2 2")
            addPathData("M6 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-6C10 8.448 9.552 8 9 8h-2C6.448 8 6 8.448 6 9v2c0 .552 .448 1 1 1h3")
        }
        return _number90Small!!
    }

private var _number90Small: ImageVector? = null
