package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodCrazyHappy: ImageVector
    get() {
        if (_moodCrazyHappy != null) return _moodCrazyHappy!!
        _moodCrazyHappy = tablerOutlineIcon(
            name = "MoodCrazyHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M7 8.5l3 3")
            addPathData("M7 11.5l3-3")
            addPathData("M14 8.5l3 3")
            addPathData("M14 11.5l3-3")
            addPathData("M9.5 15c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
        }
        return _moodCrazyHappy!!
    }

private var _moodCrazyHappy: ImageVector? = null
