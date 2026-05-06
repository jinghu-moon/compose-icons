package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodMinus: ImageVector
    get() {
        if (_moodMinus != null) return _moodMinus!!
        _moodMinus = tablerOutlineIcon(
            name = "MoodMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.48 15.014C21.81 11.273 20.531 7.103 17.334 4.75 14.136 2.397 9.774 2.418 6.598 4.801 3.423 7.183 2.184 11.366 3.549 15.094c1.365 3.728 5.012 6.121 8.975 5.89")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M16 19h6")
            addPathData("M9.5 15c.658 .64 1.56 1 2.5 1 .94 0 1.842-.36 2.5-1")
        }
        return _moodMinus!!
    }

private var _moodMinus: ImageVector? = null
