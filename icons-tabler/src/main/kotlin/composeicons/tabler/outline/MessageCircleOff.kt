package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleOff: ImageVector
    get() {
        if (_messageCircleOff != null) return _messageCircleOff!!
        _messageCircleOff = tablerOutlineIcon(
            name = "MessageCircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.595 4.577c3.223-1.176 7.025-.61 9.65 1.63 2.982 2.543 3.601 6.523 1.636 9.66M17.973 17.976C15.186 20.166 11.083 20.642 7.7 19L3 20 4.3 16.1C2.071 12.804 2.806 8.589 5.98 6.043")
            addPathData("M3 3 21 21")
        }
        return _messageCircleOff!!
    }

private var _messageCircleOff: ImageVector? = null
