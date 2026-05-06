package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MountainOff: ImageVector
    get() {
        if (_mountainOff != null) return _mountainOff!!
        _mountainOff = tablerOutlineIcon(
            name = "MountainOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.281 14.26 14.08 5.388C13.7 4.584 12.89 4.072 12.001 4.072c-.889 0-1.699 .513-2.079 1.316l-.165 .349M8.468 8.456 3 20h17")
            addPathData("M7.5 11l2 2.5 2-2")
            addPathData("M3 3 21 21")
        }
        return _mountainOff!!
    }

private var _mountainOff: ImageVector? = null
