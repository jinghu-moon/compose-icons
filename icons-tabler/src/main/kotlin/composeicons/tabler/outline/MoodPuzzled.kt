package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodPuzzled: ImageVector
    get() {
        if (_moodPuzzled != null) return _moodPuzzled!!
        _moodPuzzled = tablerOutlineIcon(
            name = "MoodPuzzled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.986 3.51C11.063 2.13 6.705 3.618 4.445 7.109 2.184 10.6 2.611 15.185 5.476 18.2c2.865 3.015 7.423 3.674 11.024 1.594C18.989 18.357 20.681 15.816 21 13")
            addPathData("M10 10h.01")
            addPathData("M14 8h.01")
            addPathData("M12 15c1-1.333 2-2 3-2")
            addPathData("M20 9v.01")
            addPathData("M20 6c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _moodPuzzled!!
    }

private var _moodPuzzled: ImageVector? = null
