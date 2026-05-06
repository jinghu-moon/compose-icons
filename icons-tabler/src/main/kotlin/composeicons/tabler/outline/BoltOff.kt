package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoltOff: ImageVector
    get() {
        if (_boltOff != null) return _boltOff!!
        _boltOff = tablerOutlineIcon(
            name = "BoltOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M15.212 15.21 11 21v-7h-6L8.79 8.79M10.475 6.47 13 3v6M14 10h5l-2.104 2.893")
        }
        return _boltOff!!
    }

private var _boltOff: ImageVector? = null
