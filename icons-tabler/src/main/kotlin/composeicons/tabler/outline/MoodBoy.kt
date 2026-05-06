package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodBoy: ImageVector
    get() {
        if (_moodBoy != null) return _moodBoy!!
        _moodBoy = tablerOutlineIcon(
            name = "MoodBoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4.5c2.035 1.357 3.43 3.483 3.864 5.89 .762 .493 1.197 1.36 1.137 2.265-.06 .905-.606 1.707-1.427 2.095-1.196 3.722-4.659 6.247-8.568 6.247-3.91 0-7.372-2.524-8.568-6.247C2.616 14.363 2.07 13.561 2.01 12.655c-.06-.905 .375-1.773 1.137-2.265C3.572 8.032 4.921 5.941 6.893 4.58")
            addPathData("M9.5 16c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
            addPathData("M8.5 2C10 3 11 5.5 11 7")
            addPathData("M12.5 2c1.5 2 2 3.5 2 5")
            addPathData("M9 12h.01")
            addPathData("M15 12h.01")
        }
        return _moodBoy!!
    }

private var _moodBoy: ImageVector? = null
