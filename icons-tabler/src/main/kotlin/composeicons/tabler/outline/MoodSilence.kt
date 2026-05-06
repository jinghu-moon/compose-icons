package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodSilence: ImageVector
    get() {
        if (_moodSilence != null) return _moodSilence!!
        _moodSilence = tablerOutlineIcon(
            name = "MoodSilence",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9")
            addPathData("M9 10h-.01")
            addPathData("M15 10h-.01")
            addPathData("M8 15h8")
            addPathData("M9 14v2")
            addPathData("M12 14v2")
            addPathData("M15 14v2")
        }
        return _moodSilence!!
    }

private var _moodSilence: ImageVector? = null
