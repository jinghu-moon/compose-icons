package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeUp: ImageVector
    get() {
        if (_homeUp != null) return _homeUp!!
        _homeUp = tablerOutlineIcon(
            name = "HomeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.641 0 1.212 .302 1.578 .771")
            addPathData("M20.136 11.136 12 3 3 12h2v7c0 1.105 .895 2 2 2h6.344")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _homeUp!!
    }

private var _homeUp: ImageVector? = null
