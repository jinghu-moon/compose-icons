package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number11Small: ImageVector
    get() {
        if (_number11Small != null) return _number11Small!!
        _number11Small = tablerOutlineIcon(
            name = "Number11Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h1v8")
            addPathData("M14 8h1v8")
        }
        return _number11Small!!
    }

private var _number11Small: ImageVector? = null
