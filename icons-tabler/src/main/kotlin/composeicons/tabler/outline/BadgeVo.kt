package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeVo: ImageVector
    get() {
        if (_badgeVo != null) return _badgeVo!!
        _badgeVo = tablerOutlineIcon(
            name = "BadgeVo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M7 9l2 6L11 9")
            addPathData("M15.5 9C16.328 9 17 9.672 17 10.5v3C17 14.328 16.328 15 15.5 15 14.672 15 14 14.328 14 13.5v-3C14 9.672 14.672 9 15.5 9")
        }
        return _badgeVo!!
    }

private var _badgeVo: ImageVector? = null
