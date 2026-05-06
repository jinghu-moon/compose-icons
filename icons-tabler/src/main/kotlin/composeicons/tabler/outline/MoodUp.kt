package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodUp: ImageVector
    get() {
        if (_moodUp != null) return _moodUp!!
        _moodUp = tablerOutlineIcon(
            name = "MoodUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.984 12.536C21.206 8.806 19.101 5.327 15.694 3.793 12.286 2.259 8.286 2.991 5.641 5.631 2.997 8.271 2.259 12.27 3.787 15.68c1.528 3.41 5.004 5.521 8.734 5.305")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1 .94 0 1.842-.36 2.5-1")
        }
        return _moodUp!!
    }

private var _moodUp: ImageVector? = null
