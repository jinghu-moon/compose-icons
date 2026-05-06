package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PinnedOff: ImageVector
    get() {
        if (_pinnedOff != null) return _pinnedOff!!
        _pinnedOff = tablerOutlineIcon(
            name = "PinnedOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M15 4.5 11.751 7.749 9.181 9.182 7 10 5.5 11.5l7 7L14 17l.82-2.186M16.25 12.251 19.5 9")
            addPathData("M9 15 4.5 19.5")
            addPathData("M14.5 4 20 9.5")
        }
        return _pinnedOff!!
    }

private var _pinnedOff: ImageVector? = null
