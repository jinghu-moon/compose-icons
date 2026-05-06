package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodCog: ImageVector
    get() {
        if (_moodCog != null) return _moodCog!!
        _moodCog = tablerOutlineIcon(
            name = "MoodCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 8.358 18.805 5.075 15.44 3.683 12.075 2.291 8.203 3.065 5.63 5.642 3.057 8.22 2.292 12.093 3.69 15.456c1.398 3.363 4.685 5.551 8.327 5.544")
            addPathData("M16.001 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M18.001 14.5v1.5")
            addPathData("M18.001 20v1.5")
            addPathData("M21.032 16.25 19.733 17")
            addPathData("M16.27 19l-1.3 .75")
            addPathData("M14.97 16.25 16.27 17")
            addPathData("M19.733 19l1.3 .75")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1")
        }
        return _moodCog!!
    }

private var _moodCog: ImageVector? = null
