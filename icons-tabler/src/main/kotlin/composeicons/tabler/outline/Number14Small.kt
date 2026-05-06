package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number14Small: ImageVector
    get() {
        if (_number14Small != null) return _number14Small!!
        _number14Small = tablerOutlineIcon(
            name = "Number14Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h1v8")
            addPathData("M13 8v3c0 .552 .448 1 1 1h3")
            addPathData("M17 8v8")
        }
        return _number14Small!!
    }

private var _number14Small: ImageVector? = null
