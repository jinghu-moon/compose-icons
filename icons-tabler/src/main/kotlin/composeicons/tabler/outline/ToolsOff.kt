package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsOff: ImageVector
    get() {
        if (_toolsOff != null) return _toolsOff!!
        _toolsOff = tablerOutlineIcon(
            name = "ToolsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12 20 8C21.105 6.895 21.105 5.105 20 4 18.895 2.895 17.105 2.895 16 4L12 8M10 10 3 17v4h4l7-7")
            addPathData("M14.5 5.5l4 4")
            addPathData("M12 8 7 3 5 5 3 7l5 5")
            addPathData("M7 8 5.5 9.5")
            addPathData("M16 12l5 5M19 19l-2 2L12 16")
            addPathData("M16 17l-1.5 1.5")
            addPathData("M3 3 21 21")
        }
        return _toolsOff!!
    }

private var _toolsOff: ImageVector? = null
