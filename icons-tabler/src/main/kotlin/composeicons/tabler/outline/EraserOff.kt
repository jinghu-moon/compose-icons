package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EraserOff: ImageVector
    get() {
        if (_eraserOff != null) return _eraserOff!!
        _eraserOff = tablerOutlineIcon(
            name = "EraserOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M19 20h-10.5L4.29 15.7c-.388-.39-.388-1.02 0-1.41l5-4.993M11.299 7.287l3-3c.39-.388 1.02-.388 1.41 0l5 5c.388 .39 .388 1.02 0 1.41-1.417 1.431-2.406 2.432-2.97 3M15.719 15.74l-4.211 4.256")
            addPathData("M18 13.3 11.7 7")
        }
        return _eraserOff!!
    }

private var _eraserOff: ImageVector? = null
