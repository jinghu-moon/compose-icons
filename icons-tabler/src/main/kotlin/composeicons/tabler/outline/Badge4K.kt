package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Badge4K: ImageVector
    get() {
        if (_badge4K != null) return _badge4K!!
        _badge4K = tablerOutlineIcon(
            name = "Badge4K",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M7 9v2c0 .552 .448 1 1 1h1")
            addPathData("M10 9v6")
            addPathData("M14 9v6")
            addPathData("M17 9l-2 3 2 3")
            addPathData("M15 12h-1")
        }
        return _badge4K!!
    }

private var _badge4K: ImageVector? = null
