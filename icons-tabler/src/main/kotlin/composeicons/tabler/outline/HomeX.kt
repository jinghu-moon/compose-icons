package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeX: ImageVector
    get() {
        if (_homeX != null) return _homeX!!
        _homeX = tablerOutlineIcon(
            name = "HomeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 13.4v-1.4h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h5.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.402 0 .777 .119 1.091 .323")
            addPathData("M21.5 21.5l-5-5")
            addPathData("M16.5 21.5l5-5")
        }
        return _homeX!!
    }

private var _homeX: ImageVector? = null
