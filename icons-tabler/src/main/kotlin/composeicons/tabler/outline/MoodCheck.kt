package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodCheck: ImageVector
    get() {
        if (_moodCheck != null) return _moodCheck!!
        _moodCheck = tablerOutlineIcon(
            name = "MoodCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.925 13.163c.335-2.568-.452-5.156-2.161-7.102C17.055 4.114 14.59 2.999 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1 .94 0 1.842-.36 2.5-1")
            addPathData("M15 19l2 2 4-4")
        }
        return _moodCheck!!
    }

private var _moodCheck: ImageVector? = null
