package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number45Small: ImageVector
    get() {
        if (_number45Small != null) return _number45Small!!
        _number45Small = tablerOutlineIcon(
            name = "Number45Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3v-4h4")
            addPathData("M6 8v3c0 .552 .448 1 1 1h3")
            addPathData("M10 8v8")
        }
        return _number45Small!!
    }

private var _number45Small: ImageVector? = null
