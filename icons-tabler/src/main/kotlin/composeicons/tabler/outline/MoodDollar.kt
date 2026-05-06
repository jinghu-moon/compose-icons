package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodDollar: ImageVector
    get() {
        if (_moodDollar != null) return _moodDollar!!
        _moodDollar = tablerOutlineIcon(
            name = "MoodDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.87 10.48C20.042 5.649 15.5 2.368 10.654 3.101 5.807 3.834 2.438 8.31 3.076 13.17c.637 4.86 5.047 8.316 9.918 7.775")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1 .357 0 .709-.052 1.043-.151")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _moodDollar!!
    }

private var _moodDollar: ImageVector? = null
