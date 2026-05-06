package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodSadDizzy: ImageVector
    get() {
        if (_moodSadDizzy != null) return _moodSadDizzy!!
        _moodSadDizzy = tablerOutlineIcon(
            name = "MoodSadDizzy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M14.5 16.05C13.842 15.378 12.941 14.999 12 14.999c-.941 0-1.842 .379-2.5 1.051")
            addPathData("M8 9l2 2")
            addPathData("M10 9 8 11")
            addPathData("M14 9l2 2")
            addPathData("M16 9l-2 2")
        }
        return _moodSadDizzy!!
    }

private var _moodSadDizzy: ImageVector? = null
