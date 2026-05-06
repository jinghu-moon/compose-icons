package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeStats: ImageVector
    get() {
        if (_homeStats != null) return _homeStats!!
        _homeStats = tablerOutlineIcon(
            name = "HomeStats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 13v-1h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h2.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2")
            addPathData("M13 22l3-3 2 2 4-4")
            addPathData("M19 17h3v3")
        }
        return _homeStats!!
    }

private var _homeStats: ImageVector? = null
