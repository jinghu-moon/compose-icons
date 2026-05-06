package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FishOff: ImageVector
    get() {
        if (_fishOff != null) return _fishOff!!
        _fishOff = tablerOutlineIcon(
            name = "FishOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.69 7.44c-.885 1.027-1.452 2.291-1.63 3.635")
            addPathData("M2 9.504c5.307 5.948 10.293 8.57 14.597 7.1M19.18 15.155c.988-.788 1.93-1.836 2.82-3.153C19 7.559 15.404 6.19 11.436 7.454M8.672 8.72C6.527 9.986 4.294 11.935 2 14.506")
            addPathData("M18 11v.01")
            addPathData("M11.153 11.169c-.287 .777-.171 1.554 .347 2.331")
            addPathData("M3 3 21 21")
        }
        return _fishOff!!
    }

private var _fishOff: ImageVector? = null
