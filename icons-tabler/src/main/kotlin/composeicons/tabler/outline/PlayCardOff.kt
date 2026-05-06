package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCardOff: ImageVector
    get() {
        if (_playCardOff != null) return _playCardOff!!
        _playCardOff = tablerOutlineIcon(
            name = "PlayCardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10c1.105 0 2 .895 2 2v10M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14")
            addPathData("M16 18h.01")
            addPathData("M13.716 13.712 12 16 9 12l1.29-1.72")
            addPathData("M3 3 21 21")
        }
        return _playCardOff!!
    }

private var _playCardOff: ImageVector? = null
