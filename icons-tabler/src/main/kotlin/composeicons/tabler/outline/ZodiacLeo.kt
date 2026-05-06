package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacLeo: ImageVector
    get() {
        if (_zodiacLeo != null) return _zodiacLeo!!
        _zodiacLeo = tablerOutlineIcon(
            name = "ZodiacLeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 17c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4")
            addPathData("M3 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 14.343 7.657 13 6 13 4.343 13 3 14.343 3 16")
            addPathData("M7 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C15 4.791 13.209 3 11 3 8.791 3 7 4.791 7 7")
            addPathData("M7 7c0 3 2 5 2 9")
            addPathData("M15 7c0 4-2 6-2 10")
        }
        return _zodiacLeo!!
    }

private var _zodiacLeo: ImageVector? = null
