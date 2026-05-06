package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlarmPlus: ImageVector
    get() {
        if (_alarmPlus != null) return _alarmPlus!!
        _alarmPlus = tablerOutlineIcon(
            name = "AlarmPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 13c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 9.134 15.866 6 12 6 8.134 6 5 9.134 5 13")
            addPathData("M7 4 4.25 6")
            addPathData("M17 4l2.75 2")
            addPathData("M10 13h4")
            addPathData("M12 11v4")
        }
        return _alarmPlus!!
    }

private var _alarmPlus: ImageVector? = null
