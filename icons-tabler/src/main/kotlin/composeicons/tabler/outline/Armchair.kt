package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = tablerOutlineIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 11c1.105 0 2 .895 2 2v2h10v-2c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-4c0-1.105 .895-2 2-2")
            addPathData("M5 11v-5C5 4.343 6.343 3 8 3h8c1.657 0 3 1.343 3 3v5")
            addPathData("M6 19v2")
            addPathData("M18 19v2")
        }
        return _armchair!!
    }

private var _armchair: ImageVector? = null
