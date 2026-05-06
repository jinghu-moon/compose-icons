package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = tablerOutlineIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12v-3C4 7.343 5.343 6 7 6h13M17 3l3 3L17 9")
            addPathData("M20 12v3c0 1.657-1.343 3-3 3h-13M7 21 4 18 7 15")
            addPathData("M11 11l1-1v4")
        }
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
