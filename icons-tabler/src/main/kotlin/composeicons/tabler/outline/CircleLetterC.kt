package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleLetterC: ImageVector
    get() {
        if (_circleLetterC != null) return _circleLetterC!!
        _circleLetterC = tablerOutlineIcon(
            name = "CircleLetterC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M14 10C14 8.895 13.105 8 12 8c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
        }
        return _circleLetterC!!
    }

private var _circleLetterC: ImageVector? = null
