package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = tablerOutlineIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 3v10c0 4.418-3.582 8-8 8C7.582 21 4 17.418 4 13v-10L7.432 6.432C8.772 5.497 10.366 4.998 12 5c1.769 0 3.403 .574 4.728 1.546L20 3")
            addPathData("M2 16h5L3 20")
            addPathData("M22 16h-5l4 4")
            addPathData("M11 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M9 11v.01")
            addPathData("M15 11v.01")
        }
        return _cat!!
    }

private var _cat: ImageVector? = null
