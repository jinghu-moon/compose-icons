package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SofaOff: ImageVector
    get() {
        if (_sofaOff != null) return _sofaOff!!
        _sofaOff = tablerOutlineIcon(
            name = "SofaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 14v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v5M19 19h-16C2.448 19 2 18.552 2 18v-5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v1h8")
            addPathData("M4 11v-3C4 6.918 4.573 5.97 5.432 5.442M9 5h8c1.657 0 3 1.343 3 3v3")
            addPathData("M12 5v3M12 12v2")
            addPathData("M3 3 21 21")
        }
        return _sofaOff!!
    }

private var _sofaOff: ImageVector? = null
