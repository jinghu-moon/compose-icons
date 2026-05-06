package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeAdOff: ImageVector
    get() {
        if (_badgeAdOff != null) return _badgeAdOff!!
        _badgeAdOff = tablerOutlineIcon(
            name = "BadgeAdOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h10c1.105 0 2 .895 2 2v10M19 19h-14C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5")
            addPathData("M14 14v1h1M17 13v-2C17 9.895 16.105 9 15 9h-1v1")
            addPathData("M7 15v-4.5c-0-.502 .25-.97 .668-1.248 .417-.278 .946-.33 1.409-.137M9.865 9.877c.087 .19 .135 .4 .135 .623v4.5")
            addPathData("M7 13h3")
            addPathData("M3 3 21 21")
        }
        return _badgeAdOff!!
    }

private var _badgeAdOff: ImageVector? = null
