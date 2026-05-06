package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jetpack: ImageVector
    get() {
        if (_jetpack != null) return _jetpack!!
        _jetpack = tablerOutlineIcon(
            name = "Jetpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6C10 4.343 8.657 3 7 3 5.343 3 4 4.343 4 6v7h6v-7")
            addPathData("M14 13h6v-7C20 4.343 18.657 3 17 3 15.343 3 14 4.343 14 6v7")
            addPathData("M5 16c0 2.333 .667 4 2 5C8.333 20 9 18.333 9 16")
            addPathData("M15 16c0 2.333 .667 4 2 5 1.333-1 2-2.667 2-5")
            addPathData("M10 8h4")
            addPathData("M10 11h4")
        }
        return _jetpack!!
    }

private var _jetpack: ImageVector? = null
