package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodXd: ImageVector
    get() {
        if (_moodXd != null) return _moodXd!!
        _moodXd = tablerOutlineIcon(
            name = "MoodXd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 14h6c0 1.657-1.343 3-3 3C10.343 17 9 15.657 9 14")
            addPathData("M9 8l6 3")
            addPathData("M9 11 15 8")
        }
        return _moodXd!!
    }

private var _moodXd: ImageVector? = null
