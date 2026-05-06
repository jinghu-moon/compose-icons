package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeEco: ImageVector
    get() {
        if (_homeEco != null) return _homeEco!!
        _homeEco = tablerOutlineIcon(
            name = "HomeEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11 12 3 3 12h2v7c0 1.105 .895 2 2 2h5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.325 0 .631 .077 .902 .215")
            addPathData("M16 22c0 0 0-2 3-4")
            addPathData("M19 21c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3h3v3c0 1.657-1.343 3-3 3")
        }
        return _homeEco!!
    }

private var _homeEco: ImageVector? = null
