package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCard3: ImageVector
    get() {
        if (_playCard3 != null) return _playCard3!!
        _playCard3 = tablerOutlineIcon(
            name = "PlayCard3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2")
            addPathData("M8 6h.01")
            addPathData("M16 18h.01")
            addPathData("M10 9h2.5C13.328 9 14 9.672 14 10.5 14 11.328 13.328 12 12.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5C14 14.328 13.328 15 12.5 15h-2.5")
        }
        return _playCard3!!
    }

private var _playCard3: ImageVector? = null
