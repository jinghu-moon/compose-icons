package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScissorsOff: ImageVector
    get() {
        if (_scissorsOff != null) return _scissorsOff!!
        _scissorsOff = tablerOutlineIcon(
            name = "ScissorsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.432 4.442C3.376 5.09 2.828 6.32 3.051 7.539c.223 1.218 1.172 2.175 2.388 2.407 1.217 .232 2.451-.307 3.107-1.357")
            addPathData("M3 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 15.343 7.657 14 6 14 4.343 14 3 15.343 3 17")
            addPathData("M8.6 15.4 12 12 14 10 19 5")
            addPathData("M3 3 21 21")
        }
        return _scissorsOff!!
    }

private var _scissorsOff: ImageVector? = null
