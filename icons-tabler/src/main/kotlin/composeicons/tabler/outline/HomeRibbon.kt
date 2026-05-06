package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeRibbon: ImageVector
    get() {
        if (_homeRibbon != null) return _homeRibbon!!
        _homeRibbon = tablerOutlineIcon(
            name = "HomeRibbon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 15h5v7L18.5 20.5 16 22v-7")
            addPathData("M20 11 12 3 3 12h2v7c0 1.105 .895 2 2 2h5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h1.5")
        }
        return _homeRibbon!!
    }

private var _homeRibbon: ImageVector? = null
