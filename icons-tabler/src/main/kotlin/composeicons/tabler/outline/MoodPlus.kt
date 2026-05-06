package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodPlus: ImageVector
    get() {
        if (_moodPlus != null) return _moodPlus!!
        _moodPlus = tablerOutlineIcon(
            name = "MoodPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.985 12.528C21.204 8.797 19.095 5.319 15.686 3.789 12.276 2.259 8.276 2.995 5.634 5.638 2.993 8.282 2.26 12.283 3.792 15.691c1.533 3.408 5.012 5.515 8.743 5.293")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1 .94 0 1.842-.36 2.5-1")
        }
        return _moodPlus!!
    }

private var _moodPlus: ImageVector? = null
