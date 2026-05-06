package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Theater: ImageVector
    get() {
        if (_theater != null) return _theater!!
        _theater = tablerOutlineIcon(
            name = "Theater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M20 16v-10C20 4.895 19.105 4 18 4h-12C4.895 4 4 4.895 4 6v10L8 10c2.667 1.333 5.333 1.333 8 0l4 6")
        }
        return _theater!!
    }

private var _theater: ImageVector? = null
