package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BandageOff: ImageVector
    get() {
        if (_bandageOff != null) return _bandageOff!!
        _bandageOff = tablerOutlineIcon(
            name = "BandageOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12v.01")
            addPathData("M12 14v.01")
            addPathData("M10.513 6.487 12.5 4.5c1.939-1.9 5.046-1.884 6.965 .035 1.919 1.919 1.935 5.026 .035 6.965l-2.018 2.018M15.5 15.5l-4 4C9.561 21.4 6.454 21.384 4.535 19.465 2.616 17.546 2.6 14.439 4.5 12.5l4-4")
            addPathData("M3 3 21 21")
        }
        return _bandageOff!!
    }

private var _bandageOff: ImageVector? = null
