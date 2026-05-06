package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodEdit: ImageVector
    get() {
        if (_moodEdit != null) return _moodEdit!!
        _moodEdit = tablerOutlineIcon(
            name = "MoodEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.955 11.104C20.484 6.395 16.446 2.855 11.715 3.005 6.985 3.154 3.178 6.942 3.006 11.672c-.173 4.73 3.347 8.785 8.054 9.279")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .672 1.56 1 2.5 1 .126 0 .251-.006 .376-.018")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _moodEdit!!
    }

private var _moodEdit: ImageVector? = null
