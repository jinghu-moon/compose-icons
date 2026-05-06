package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ElevatorOff: ImageVector
    get() {
        if (_elevatorOff != null) return _elevatorOff!!
        _elevatorOff = tablerOutlineIcon(
            name = "ElevatorOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c.552 0 1 .448 1 1v10M19 19c0 .552-.448 1-1 1h-12C5.448 20 5 19.552 5 19v-14")
            addPathData("M12 8l2 2")
            addPathData("M10 14l2 2 2-2")
            addPathData("M3 3 21 21")
        }
        return _elevatorOff!!
    }

private var _elevatorOff: ImageVector? = null
