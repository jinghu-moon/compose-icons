package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeMinus: ImageVector
    get() {
        if (_homeMinus != null) return _homeMinus!!
        _homeMinus = tablerOutlineIcon(
            name = "HomeMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 15v-3h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h5.5")
            addPathData("M16 19h6")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2")
        }
        return _homeMinus!!
    }

private var _homeMinus: ImageVector? = null
