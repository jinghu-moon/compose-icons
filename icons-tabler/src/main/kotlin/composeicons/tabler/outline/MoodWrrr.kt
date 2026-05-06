package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodWrrr: ImageVector
    get() {
        if (_moodWrrr != null) return _moodWrrr!!
        _moodWrrr = tablerOutlineIcon(
            name = "MoodWrrr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M8 16 9 15l1.5 1L12 15l1.5 1L15 15l1 1")
            addPathData("M8.5 11.5 10 10 8.5 8.5")
            addPathData("M15.5 11.5 14 10 15.5 8.5")
        }
        return _moodWrrr!!
    }

private var _moodWrrr: ImageVector? = null
