package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodUnamused: ImageVector
    get() {
        if (_moodUnamused != null) return _moodUnamused!!
        _moodUnamused = tablerOutlineIcon(
            name = "MoodUnamused",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M11 16l4-1.5")
            addPathData("M10 10C9.5 9 7.5 9 7 10")
            addPathData("M17 10C16.5 9 14.5 9 14 10")
        }
        return _moodUnamused!!
    }

private var _moodUnamused: ImageVector? = null
