package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCard: ImageVector
    get() {
        if (_playCard != null) return _playCard!!
        _playCard = tablerOutlineIcon(
            name = "PlayCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2")
            addPathData("M8 6h.01")
            addPathData("M16 18h.01")
            addPathData("M12 16 9 12 12 8l3 4-3 4")
        }
        return _playCard!!
    }

private var _playCard: ImageVector? = null
