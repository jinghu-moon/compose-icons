package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LegoOff: ImageVector
    get() {
        if (_legoOff != null) return _legoOff!!
        _legoOff = tablerOutlineIcon(
            name = "LegoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 11h.01")
            addPathData("M9.5 15c.658 .672 1.559 1.051 2.5 1.051 .941 0 1.842-.379 2.5-1.051")
            addPathData("M8 4v-1h8v2h1c1.657 0 3 1.343 3 3v8M19.116 19.127c-.562 .56-1.323 .874-2.116 .873v1h-10v-1C5.343 20 4 18.657 4 17v-9C4 6.917 4.574 5.968 5.435 5.44")
            addPathData("M3 3 21 21")
        }
        return _legoOff!!
    }

private var _legoOff: ImageVector? = null
