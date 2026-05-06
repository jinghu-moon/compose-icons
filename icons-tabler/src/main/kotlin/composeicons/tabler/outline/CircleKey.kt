package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleKey: ImageVector
    get() {
        if (_circleKey != null) return _circleKey!!
        _circleKey = tablerOutlineIcon(
            name = "CircleKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C16 8.895 15.105 8 14 8c-1.105 0-2 .895-2 2")
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9")
            addPathData("M12.5 11.5l-4 4L10 17")
            addPathData("M12 15 10.5 13.5")
        }
        return _circleKey!!
    }

private var _circleKey: ImageVector? = null
