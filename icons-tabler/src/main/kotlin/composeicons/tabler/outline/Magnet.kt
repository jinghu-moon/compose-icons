package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = tablerOutlineIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13v-8C4 3.895 4.895 3 6 3h1c1.105 0 2 .895 2 2v8c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-8c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v8c0 4.418-3.582 8-8 8C7.582 21 4 17.418 4 13")
            addPathData("M4 8h5")
            addPathData("M15 8h4")
        }
        return _magnet!!
    }

private var _magnet: ImageVector? = null
