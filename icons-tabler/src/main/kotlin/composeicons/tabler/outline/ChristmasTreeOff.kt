package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChristmasTreeOff: ImageVector
    get() {
        if (_christmasTreeOff != null) return _christmasTreeOff!!
        _christmasTreeOff = tablerOutlineIcon(
            name = "ChristmasTreeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 5.5 12 3l4 4L14 8l4 4-1.5 .5M17 17h-12L9 13 6 12 9 9")
            addPathData("M14 17v3c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-3")
            addPathData("M3 3 21 21")
        }
        return _christmasTreeOff!!
    }

private var _christmasTreeOff: ImageVector? = null
