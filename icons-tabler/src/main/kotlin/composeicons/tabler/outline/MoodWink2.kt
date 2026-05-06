package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodWink2: ImageVector
    get() {
        if (_moodWink2 != null) return _moodWink2!!
        _moodWink2 = tablerOutlineIcon(
            name = "MoodWink2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M9 10h-.01")
            addPathData("M14.5 15c-.658 .672-1.559 1.051-2.5 1.051-.941 0-1.842-.379-2.5-1.051")
            addPathData("M15.5 8.5 14 10l1.5 1.5")
        }
        return _moodWink2!!
    }

private var _moodWink2: ImageVector? = null
