package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CursorOff: ImageVector
    get() {
        if (_cursorOff != null) return _cursorOff!!
        _cursorOff = tablerOutlineIcon(
            name = "CursorOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4c1.657 0 3 1.343 3 3v1M12 17c0 1.657-1.343 3-3 3")
            addPathData("M15 4C13.343 4 12 5.343 12 7v1M12 12v5c0 1.657 1.343 3 3 3")
            addPathData("M3 3 21 21")
        }
        return _cursorOff!!
    }

private var _cursorOff: ImageVector? = null
