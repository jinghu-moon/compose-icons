package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapDiscount: ImageVector
    get() {
        if (_mapDiscount != null) return _mapDiscount!!
        _mapDiscount = tablerOutlineIcon(
            name = "MapDiscount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19 9 17 3 20v-13L9 4l6 3L21 4v8.5")
            addPathData("M9 4v13")
            addPathData("M15 7v5.5")
            addPathData("M16 21l5-5")
            addPathData("M21 21v.01")
            addPathData("M16 16v.01")
        }
        return _mapDiscount!!
    }

private var _mapDiscount: ImageVector? = null
