package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CirclePercentage: ImageVector
    get() {
        if (_circlePercentage != null) return _circlePercentage!!
        _circlePercentage = tablerOutlineIcon(
            name = "CirclePercentage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 15.075l6-6")
            addPathData("M9 9.105v.015")
            addPathData("M15 15.12v.015")
        }
        return _circlePercentage!!
    }

private var _circlePercentage: ImageVector? = null
