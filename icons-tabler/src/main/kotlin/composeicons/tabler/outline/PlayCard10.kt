package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCard10: ImageVector
    get() {
        if (_playCard10 != null) return _playCard10!!
        _playCard10 = tablerOutlineIcon(
            name = "PlayCard10",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2")
            addPathData("M8 6h.01")
            addPathData("M16 18h.01")
            addPathData("M9 9v6")
            addPathData("M12 13c0 1.105 .672 2 1.5 2C14.328 15 15 14.105 15 13v-2C15 9.895 14.328 9 13.5 9 12.672 9 12 9.895 12 11v2")
        }
        return _playCard10!!
    }

private var _playCard10: ImageVector? = null
