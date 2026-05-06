package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PencilOff: ImageVector
    get() {
        if (_pencilOff != null) return _pencilOff!!
        _pencilOff = tablerOutlineIcon(
            name = "PencilOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10 4 16v4h4l6-6M15.99 12.01 18.494 9.506c1.105-1.105 1.105-2.895 0-4-1.105-1.105-2.895-1.105-4 0L11.994 8.006")
            addPathData("M13.5 6.5l4 4")
            addPathData("M3 3 21 21")
        }
        return _pencilOff!!
    }

private var _pencilOff: ImageVector? = null
