package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeSd: ImageVector
    get() {
        if (_badgeSd != null) return _badgeSd!!
        _badgeSd = tablerOutlineIcon(
            name = "BadgeSd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M14 9v6h1c1.105 0 2-.895 2-2v-2C17 9.895 16.105 9 15 9h-1")
            addPathData("M7 14.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-1C7.448 12 7 11.552 7 11v-1C7 9.448 7.448 9 8 9h1.25c.414 0 .75 .336 .75 .75")
        }
        return _badgeSd!!
    }

private var _badgeSd: ImageVector? = null
