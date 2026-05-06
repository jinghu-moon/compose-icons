package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeDot: ImageVector
    get() {
        if (_homeDot != null) return _homeDot!!
        _homeDot = tablerOutlineIcon(
            name = "HomeDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 12h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h5")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.641 0 1.212 .302 1.578 .771")
        }
        return _homeDot!!
    }

private var _homeDot: ImageVector? = null
