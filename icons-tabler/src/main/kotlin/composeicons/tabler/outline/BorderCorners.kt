package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderCorners: ImageVector
    get() {
        if (_borderCorners != null) return _borderCorners!!
        _borderCorners = tablerOutlineIcon(
            name = "BorderCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M20 16v2c0 1.105-.895 2-2 2h-2")
            addPathData("M8 20h-2C4.895 20 4 19.105 4 18v-2")
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
        }
        return _borderCorners!!
    }

private var _borderCorners: ImageVector? = null
