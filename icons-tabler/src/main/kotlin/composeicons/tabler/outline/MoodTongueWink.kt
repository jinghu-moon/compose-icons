package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodTongueWink: ImageVector
    get() {
        if (_moodTongueWink != null) return _moodTongueWink!!
        _moodTongueWink = tablerOutlineIcon(
            name = "MoodTongueWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 10h.01")
            addPathData("M10 14v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-2")
            addPathData("M15.5 14h-7")
            addPathData("M17 10C16.5 9 14.5 9 14 10")
        }
        return _moodTongueWink!!
    }

private var _moodTongueWink: ImageVector? = null
