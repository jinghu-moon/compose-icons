package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number18Small: ImageVector
    get() {
        if (_number18Small != null) return _number18Small!!
        _number18Small = tablerOutlineIcon(
            name = "Number18Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h1v8")
            addPathData("M15 12h-1c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1")
        }
        return _number18Small!!
    }

private var _number18Small: ImageVector? = null
