package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodAnnoyed2: ImageVector
    get() {
        if (_moodAnnoyed2 != null) return _moodAnnoyed2!!
        _moodAnnoyed2 = tablerOutlineIcon(
            name = "MoodAnnoyed2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M15 14c-2 0-3 1-3.5 2.05")
            addPathData("M10 9.25c-.5 1-2.5 1-3 0")
            addPathData("M17 9.25c-.5 1-2.5 1-3 0")
        }
        return _moodAnnoyed2!!
    }

private var _moodAnnoyed2: ImageVector? = null
