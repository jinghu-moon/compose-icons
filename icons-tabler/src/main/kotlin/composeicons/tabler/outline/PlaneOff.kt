package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneOff: ImageVector
    get() {
        if (_planeOff != null) return _planeOff!!
        _planeOff = tablerOutlineIcon(
            name = "PlaneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.788 5.758 9 3h3l4 7h4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2M15.282 15.256 12 21h-3l2-7h-4L5 16h-3L4 12 2 8h3l2 2h3")
            addPathData("M3 3 21 21")
        }
        return _planeOff!!
    }

private var _planeOff: ImageVector? = null
