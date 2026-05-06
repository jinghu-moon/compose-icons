package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number31Small: ImageVector
    get() {
        if (_number31Small != null) return _number31Small!!
        _number31Small = tablerOutlineIcon(
            name = "Number31Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h1v8")
            addPathData("M7 8h2.5C10.328 8 11 8.672 11 9.5v1C11 11.328 10.328 12 9.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C11 15.328 10.328 16 9.5 16h-2.5")
        }
        return _number31Small!!
    }

private var _number31Small: ImageVector? = null
