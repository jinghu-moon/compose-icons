package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number13Small: ImageVector
    get() {
        if (_number13Small != null) return _number13Small!!
        _number13Small = tablerOutlineIcon(
            name = "Number13Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h1v8")
            addPathData("M13 8h2.5C16.328 8 17 8.672 17 9.5v1C17 11.328 16.328 12 15.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C17 15.328 16.328 16 15.5 16h-2.5")
        }
        return _number13Small!!
    }

private var _number13Small: ImageVector? = null
