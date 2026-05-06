package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AugmentedReality2: ImageVector
    get() {
        if (_augmentedReality2 != null) return _augmentedReality2!!
        _augmentedReality2 = tablerOutlineIcon(
            name = "AugmentedReality2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 21h-2C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v3.5")
            addPathData("M17 17 13 14.5 17 12l4 2.5v4.5l-4 2.5v-4.5")
            addPathData("M13 14.5v4.5l4 2.5")
            addPathData("M17 17l4-2.5")
            addPathData("M11 4h2")
        }
        return _augmentedReality2!!
    }

private var _augmentedReality2: ImageVector? = null
