package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleLetterK: ImageVector
    get() {
        if (_circleLetterK != null) return _circleLetterK!!
        _circleLetterK = tablerOutlineIcon(
            name = "CircleLetterK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10 8v8")
            addPathData("M14 8l-2.5 4L14 16")
            addPathData("M10 12h1.5")
        }
        return _circleLetterK!!
    }

private var _circleLetterK: ImageVector? = null
