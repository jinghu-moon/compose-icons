package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOnlyfans: ImageVector
    get() {
        if (_brandOnlyfans != null) return _brandOnlyfans!!
        _brandOnlyfans = tablerOutlineIcon(
            name = "BrandOnlyfans",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.5 6C4.91 6 2 8.91 2 12.5 2 16.09 4.91 19 8.5 19 12.09 19 15 16.09 15 12.5 15 8.91 12.09 6 8.5 6")
            addPathData("M8.5 15C7.119 15 6 13.881 6 12.5 6 11.119 7.119 10 8.5 10 9.881 10 11 11.119 11 12.5 11 13.881 9.881 15 8.5 15")
            addPathData("M14 16c2.5 0 6.42-1.467 7-4h-6c3-1 6.44-3.533 7-6h-4C14.97 6 14.236 5.804 13 7.5")
        }
        return _brandOnlyfans!!
    }

private var _brandOnlyfans: ImageVector? = null
