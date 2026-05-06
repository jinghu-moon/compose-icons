package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodAngry: ImageVector
    get() {
        if (_moodAngry != null) return _moodAngry!!
        _moodAngry = tablerOutlineIcon(
            name = "MoodAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M8 9l2 1")
            addPathData("M16 9l-2 1")
            addPathData("M14.5 16.05C13.842 15.378 12.941 14.999 12 14.999c-.941 0-1.842 .379-2.5 1.051")
        }
        return _moodAngry!!
    }

private var _moodAngry: ImageVector? = null
