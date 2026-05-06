package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = tablerOutlineIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C4.895 20 4 19.105 4 18v-3")
            addPathData("M15 15c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1c-1.105 0-2-.895-2-2v-3")
            addPathData("M4 15v-3C4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8v3")
        }
        return _headphones!!
    }

private var _headphones: ImageVector? = null
