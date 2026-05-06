package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodNerd: ImageVector
    get() {
        if (_moodNerd != null) return _moodNerd!!
        _moodNerd = tablerOutlineIcon(
            name = "MoodNerd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M6 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 8.895 9.105 8 8 8 6.895 8 6 8.895 6 10")
            addPathData("M14 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C18 8.895 17.105 8 16 8c-1.105 0-2 .895-2 2")
            addPathData("M9.5 15c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
            addPathData("M3.5 9h2.5")
            addPathData("M18 9h2.5")
            addPathData("M10 9.5c1.333-1.333 2.667-1.333 4 0")
        }
        return _moodNerd!!
    }

private var _moodNerd: ImageVector? = null
