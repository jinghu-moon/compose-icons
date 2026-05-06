package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeCheck: ImageVector
    get() {
        if (_homeCheck != null) return _homeCheck!!
        _homeCheck = tablerOutlineIcon(
            name = "HomeCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2")
            addPathData("M19 13.488v-1.488h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h4.525")
            addPathData("M15 19l2 2 4-4")
        }
        return _homeCheck!!
    }

private var _homeCheck: ImageVector? = null
