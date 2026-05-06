package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RubberStamp: ImageVector
    get() {
        if (_rubberStamp != null) return _rubberStamp!!
        _rubberStamp = tablerOutlineIcon(
            name = "RubberStamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17.85h-18C3 13.8 4.421 13.8 6.79 13.8 12 13.8 8 9.21 8 7 8 4.791 9.791 3 12 3c2.209 0 4 1.791 4 4 0 2.21-4 6.8 1.21 6.8 2.369 0 3.79 0 3.79 4.05")
            addPathData("M5 21h14")
        }
        return _rubberStamp!!
    }

private var _rubberStamp: ImageVector? = null
