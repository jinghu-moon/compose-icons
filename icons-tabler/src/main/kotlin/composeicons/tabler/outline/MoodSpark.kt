package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodSpark: ImageVector
    get() {
        if (_moodSpark != null) return _moodSpark!!
        _moodSpark = tablerOutlineIcon(
            name = "MoodSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 8.359 18.807 5.077 15.443 3.685 12.079 2.292 8.207 3.063 5.634 5.638 3.06 8.213 2.292 12.085 3.687 15.448c1.395 3.363 4.678 5.554 8.319 5.552")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
        }
        return _moodSpark!!
    }

private var _moodSpark: ImageVector? = null
