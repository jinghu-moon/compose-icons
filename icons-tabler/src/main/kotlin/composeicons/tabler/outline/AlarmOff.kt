package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlarmOff: ImageVector
    get() {
        if (_alarmOff != null) return _alarmOff!!
        _alarmOff = tablerOutlineIcon(
            name = "AlarmOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.587 7.566C5.514 9.25 4.58 11.967 5.18 14.57c.599 2.603 2.628 4.638 5.229 5.245 2.601 .608 5.321-.318 7.012-2.385M18.77 14.785c.635-2.406-.054-4.968-1.811-6.73C15.202 6.293 12.642 5.597 10.234 6.225")
            addPathData("M12 12v1h1")
            addPathData("M5.261 5.265 4.25 6")
            addPathData("M17 4l2.75 2")
            addPathData("M3 3 21 21")
        }
        return _alarmOff!!
    }

private var _alarmOff: ImageVector? = null
