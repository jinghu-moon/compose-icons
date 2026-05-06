package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeCancel: ImageVector
    get() {
        if (_homeCancel != null) return _homeCancel!!
        _homeCancel = tablerOutlineIcon(
            name = "HomeCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
            addPathData("M19 12h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h5.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.58 0 1.103 .247 1.468 .642")
        }
        return _homeCancel!!
    }

private var _homeCancel: ImageVector? = null
