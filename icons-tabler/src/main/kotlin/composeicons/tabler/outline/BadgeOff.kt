package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeOff: ImageVector
    get() {
        if (_badgeOff != null) return _badgeOff!!
        _badgeOff = tablerOutlineIcon(
            name = "BadgeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7v10l5 3 5-3M17 13v-9L12 7 9.504 5.503")
            addPathData("M3 3 21 21")
        }
        return _badgeOff!!
    }

private var _badgeOff: ImageVector? = null
