package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodSick: ImageVector
    get() {
        if (_moodSick != null) return _moodSick!!
        _moodSick = tablerOutlineIcon(
            name = "MoodSick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M9 10h-.01")
            addPathData("M15 10h-.01")
            addPathData("M8 16 9 15l1.5 1L12 15l1.5 1L15 15l1 1")
        }
        return _moodSick!!
    }

private var _moodSick: ImageVector? = null
