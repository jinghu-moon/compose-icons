package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BedFlat: ImageVector
    get() {
        if (_bedFlat != null) return _bedFlat!!
        _bedFlat = tablerOutlineIcon(
            name = "BedFlat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 9.895 6.105 9 5 9 3.895 9 3 9.895 3 11")
            addPathData("M10 13h11v-2C21 9.343 19.657 8 18 8h-8v5")
            addPathData("M3 16h18")
        }
        return _bedFlat!!
    }

private var _bedFlat: ImageVector? = null
