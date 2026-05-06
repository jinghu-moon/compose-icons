package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number46Small: ImageVector
    get() {
        if (_number46Small != null) return _number46Small!!
        _number46Small = tablerOutlineIcon(
            name = "Number46Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 9C18 8.448 17.552 8 17 8h-2c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3")
            addPathData("M6 8v3c0 .552 .448 1 1 1h3")
            addPathData("M10 8v8")
        }
        return _number46Small!!
    }

private var _number46Small: ImageVector? = null
