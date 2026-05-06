package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number41Small: ImageVector
    get() {
        if (_number41Small != null) return _number41Small!!
        _number41Small = tablerOutlineIcon(
            name = "Number41Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h1v8")
            addPathData("M6 8v3c0 .552 .448 1 1 1h3")
            addPathData("M10 8v8")
        }
        return _number41Small!!
    }

private var _number41Small: ImageVector? = null
