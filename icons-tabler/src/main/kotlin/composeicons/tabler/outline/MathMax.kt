package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathMax: ImageVector
    get() {
        if (_mathMax != null) return _mathMax!!
        _mathMax = tablerOutlineIcon(
            name = "MathMax",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6c0 1.105 .895 2 2 2C8.105 8 9 7.105 9 6 9 4.895 8.105 4 7 4 5.895 4 5 4.895 5 6")
            addPathData("M3 15C3 15 3.616 9.456 5.332 7.07")
            addPathData("M8.637 7.112C11.354 10.425 14.519 20 17 20c2 0 3.333-3 4-9")
        }
        return _mathMax!!
    }

private var _mathMax: ImageVector? = null
