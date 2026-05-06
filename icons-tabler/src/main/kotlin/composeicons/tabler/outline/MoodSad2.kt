package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodSad2: ImageVector
    get() {
        if (_moodSad2 != null) return _moodSad2!!
        _moodSad2 = tablerOutlineIcon(
            name = "MoodSad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M14.5 16.05C13.842 15.378 12.941 14.999 12 14.999c-.941 0-1.842 .379-2.5 1.051")
            addPathData("M10 9.25c-.5 1-2.5 1-3 0")
            addPathData("M17 9.25c-.5 1-2.5 1-3 0")
        }
        return _moodSad2!!
    }

private var _moodSad2: ImageVector? = null
