package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodShare: ImageVector
    get() {
        if (_moodShare != null) return _moodShare!!
        _moodShare = tablerOutlineIcon(
            name = "MoodShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.942 13.018C21.364 9.309 19.453 5.724 16.137 4.008 12.822 2.291 8.791 2.8 6.006 5.286 3.221 7.772 2.26 11.719 3.591 15.207 4.921 18.695 8.267 21 12 21")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .672 1.56 1 2.5 1 .213 0 .424-.017 .63-.05")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _moodShare!!
    }

private var _moodShare: ImageVector? = null
