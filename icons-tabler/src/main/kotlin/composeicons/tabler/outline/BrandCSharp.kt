package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCSharp: ImageVector
    get() {
        if (_brandCSharp != null) return _brandCSharp!!
        _brandCSharp = tablerOutlineIcon(
            name = "BrandCSharp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9C10 7.343 8.657 6 7 6h-.5C4.567 6 3 7.567 3 9.5v5C3 16.433 4.567 18 6.5 18h.5c1.657 0 3-1.343 3-3")
            addPathData("M16 7 15 17")
            addPathData("M20 7 19 17")
            addPathData("M14 10h7.5")
            addPathData("M21 14h-7.5")
        }
        return _brandCSharp!!
    }

private var _brandCSharp: ImageVector? = null
