package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodTongueWink2: ImageVector
    get() {
        if (_moodTongueWink2 != null) return _moodTongueWink2!!
        _moodTongueWink2 = tablerOutlineIcon(
            name = "MoodTongueWink2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M15 10h-.01")
            addPathData("M10 14v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-2M15.5 14h-7")
            addPathData("M7 10c.5-1 2.5-1 3 0")
        }
        return _moodTongueWink2!!
    }

private var _moodTongueWink2: ImageVector? = null
