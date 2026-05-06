package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLaravel: ImageVector
    get() {
        if (_brandLaravel != null) return _brandLaravel!!
        _brandLaravel = tablerOutlineIcon(
            name = "BrandLaravel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17l8 5 7-4v-8L14 7.5 18 5l4 2.5v4L11 18 7 15.5v-7.5L3 5.5v11.5")
            addPathData("M11 18v4")
            addPathData("M7 15.5l7-4")
            addPathData("M14 7.5v4")
            addPathData("M14 11.5 18 14")
            addPathData("M11 13v-7.5L7 3 3 5.5")
            addPathData("M7 8 11 5.5")
            addPathData("M18 10 22 7.5")
        }
        return _brandLaravel!!
    }

private var _brandLaravel: ImageVector? = null
