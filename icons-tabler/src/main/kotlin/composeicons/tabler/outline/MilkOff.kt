package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MilkOff: ImageVector
    get() {
        if (_milkOff != null) return _milkOff!!
        _milkOff = tablerOutlineIcon(
            name = "MilkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h6v-2C16 3.448 15.552 3 15 3h-6C8.448 3 8 3.448 8 4")
            addPathData("M16 6l1.094 1.759c.592 .951 .906 2.049 .906 3.17v3.071M18 18v1c0 1.105-.895 2-2 2h-8C6.895 21 6 20.105 6 19v-8.071C6 9.808 6.314 8.71 6.906 7.759l.327-.525")
            addPathData("M10 16c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M3 3 21 21")
        }
        return _milkOff!!
    }

private var _milkOff: ImageVector? = null
