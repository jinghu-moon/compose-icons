package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number54Small: ImageVector
    get() {
        if (_number54Small != null) return _number54Small!!
        _number54Small = tablerOutlineIcon(
            name = "Number54Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8v3c0 .552 .448 1 1 1h3")
            addPathData("M18 8v8")
            addPathData("M6 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3v-4h4")
        }
        return _number54Small!!
    }

private var _number54Small: ImageVector? = null
