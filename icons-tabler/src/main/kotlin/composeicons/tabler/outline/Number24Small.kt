package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number24Small: ImageVector
    get() {
        if (_number24Small != null) return _number24Small!!
        _number24Small = tablerOutlineIcon(
            name = "Number24Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8v3c0 .552 .448 1 1 1h3")
            addPathData("M18 8v8")
            addPathData("M6 8h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
        }
        return _number24Small!!
    }

private var _number24Small: ImageVector? = null
