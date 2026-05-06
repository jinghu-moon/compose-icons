package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodOff: ImageVector
    get() {
        if (_moodOff != null) return _moodOff!!
        _moodOff = tablerOutlineIcon(
            name = "MoodOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.634 5.638C2.12 9.154 2.122 14.852 5.638 18.366c3.516 3.514 9.214 3.512 12.728-.004M20.045 16.04C21.788 12.573 21.113 8.379 18.37 5.634 15.627 2.889 11.433 2.212 7.965 3.954")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
            addPathData("M3 3 21 21")
        }
        return _moodOff!!
    }

private var _moodOff: ImageVector? = null
