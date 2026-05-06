package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleHalf2: ImageVector
    get() {
        if (_circleHalf2 != null) return _circleHalf2!!
        _circleHalf2 = tablerOutlineIcon(
            name = "CircleHalf2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 3v18")
            addPathData("M12 14 19 7")
            addPathData("M12 19l8.5-8.5")
            addPathData("M12 9 16.5 4.5")
        }
        return _circleHalf2!!
    }

private var _circleHalf2: ImageVector? = null
