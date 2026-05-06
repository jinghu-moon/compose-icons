package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeShield: ImageVector
    get() {
        if (_homeShield != null) return _homeShield!!
        _homeShield = tablerOutlineIcon(
            name = "HomeShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h-2L12 3l7.636 7.636")
            addPathData("M5 12v7c0 1.105 .895 2 2 2h5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h1.5")
            addPathData("M22 16c0 4-2.5 6-3.5 6C17.5 22 15 20 15 16c1 0 2.5-.5 3.5-1.5C19.5 15.5 21 16 22 16")
        }
        return _homeShield!!
    }

private var _homeShield: ImageVector? = null
