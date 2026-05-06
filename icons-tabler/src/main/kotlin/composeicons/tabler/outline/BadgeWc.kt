package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeWc: ImageVector
    get() {
        if (_badgeWc != null) return _badgeWc!!
        _badgeWc = tablerOutlineIcon(
            name = "BadgeWc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M6.5 9 7 15 9 11l2 4 .5-6")
            addPathData("M17 10.5C17 9.672 16.328 9 15.5 9 14.672 9 14 9.672 14 10.5v3c0 .828 .672 1.5 1.5 1.5C16.328 15 17 14.328 17 13.5")
        }
        return _badgeWc!!
    }

private var _badgeWc: ImageVector? = null
