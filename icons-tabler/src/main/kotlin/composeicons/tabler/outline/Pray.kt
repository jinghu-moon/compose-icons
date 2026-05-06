package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pray: ImageVector
    get() {
        if (_pray != null) return _pray!!
        _pray = tablerOutlineIcon(
            name = "Pray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 4.448 12.552 4 12 4c-.552 0-1 .448-1 1")
            addPathData("M7 20h8L11 16v-7l4 3 2-2")
        }
        return _pray!!
    }

private var _pray: ImageVector? = null
