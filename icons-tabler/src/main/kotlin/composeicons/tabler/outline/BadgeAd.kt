package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeAd: ImageVector
    get() {
        if (_badgeAd != null) return _badgeAd!!
        _badgeAd = tablerOutlineIcon(
            name = "BadgeAd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M14 9v6h1c1.105 0 2-.895 2-2v-2C17 9.895 16.105 9 15 9h-1")
            addPathData("M7 15v-4.5C7 9.672 7.672 9 8.5 9 9.328 9 10 9.672 10 10.5v4.5")
            addPathData("M7 13h3")
        }
        return _badgeAd!!
    }

private var _badgeAd: ImageVector? = null
