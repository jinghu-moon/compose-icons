package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodX: ImageVector
    get() {
        if (_moodX != null) return _moodX!!
        _moodX = tablerOutlineIcon(
            name = "MoodX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.983 12.556C21.214 8.822 19.111 5.334 15.701 3.796 12.291 2.258 8.285 2.989 5.639 5.634 2.992 8.278 2.258 12.284 3.794 15.695c1.536 3.411 5.022 5.517 8.756 5.288")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1 .194 0 .386-.015 .574-.045")
            addPathData("M21.5 21.5l-5-5")
            addPathData("M16.5 21.5l5-5")
        }
        return _moodX!!
    }

private var _moodX: ImageVector? = null
