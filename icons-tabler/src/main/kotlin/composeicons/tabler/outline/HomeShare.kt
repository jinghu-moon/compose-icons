package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeShare: ImageVector
    get() {
        if (_homeShare != null) return _homeShare!!
        _homeShare = tablerOutlineIcon(
            name = "HomeShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.247 0 .484 .045 .702 .127")
            addPathData("M19 12h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h5")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _homeShare!!
    }

private var _homeShare: ImageVector? = null
