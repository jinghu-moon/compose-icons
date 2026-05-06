package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChristmasTree: ImageVector
    get() {
        if (_christmasTree != null) return _christmasTree!!
        _christmasTree = tablerOutlineIcon(
            name = "ChristmasTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3l4 4L14 8l4 4-3 1 4 4h-14L9 13 6 12 10 8 8 7 12 3")
            addPathData("M14 17v3c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-3")
        }
        return _christmasTree!!
    }

private var _christmasTree: ImageVector? = null
