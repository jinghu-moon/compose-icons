package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CalendarBolt: ImageVector
    get() {
        if (_calendarBolt != null) return _calendarBolt!!
        _calendarBolt = tablerOutlineIcon(
            name = "CalendarBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 21h-7.5C4.895 21 4 20.105 4 19v-12C4 5.895 4.895 5 6 5h12c1.105 0 2 .895 2 2v5")
            addPathData("M16 3v4")
            addPathData("M8 3v4")
            addPathData("M4 11h16")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _calendarBolt!!
    }

private var _calendarBolt: ImageVector? = null
