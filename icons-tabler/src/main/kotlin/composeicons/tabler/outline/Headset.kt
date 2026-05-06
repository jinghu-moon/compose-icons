package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = tablerOutlineIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14v-3C4 6.582 7.582 3 12 3c4.418 0 8 3.582 8 8v3")
            addPathData("M18 19c0 1.657-2.686 3-6 3")
            addPathData("M4 14c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C4.895 19 4 18.105 4 17v-3")
            addPathData("M15 14c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1c-1.105 0-2-.895-2-2v-3")
        }
        return _headset!!
    }

private var _headset: ImageVector? = null
