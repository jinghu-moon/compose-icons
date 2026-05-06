package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodSad: ImageVector
    get() {
        if (_moodSad != null) return _moodSad!!
        _moodSad = tablerOutlineIcon(
            name = "MoodSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15.25c.658-.672 1.559-1.051 2.5-1.051 .941 0 1.842 .379 2.5 1.051")
        }
        return _moodSad!!
    }

private var _moodSad: ImageVector? = null
