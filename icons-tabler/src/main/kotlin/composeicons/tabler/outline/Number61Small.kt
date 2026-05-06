package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number61Small: ImageVector
    get() {
        if (_number61Small != null) return _number61Small!!
        _number61Small = tablerOutlineIcon(
            name = "Number61Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h1v8")
            addPathData("M11 9C11 8.448 10.552 8 10 8h-2C7.448 8 7 8.448 7 9v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3")
        }
        return _number61Small!!
    }

private var _number61Small: ImageVector? = null
