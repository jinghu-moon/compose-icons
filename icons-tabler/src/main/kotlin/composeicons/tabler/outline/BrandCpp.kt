package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCpp: ImageVector
    get() {
        if (_brandCpp != null) return _brandCpp!!
        _brandCpp = tablerOutlineIcon(
            name = "BrandCpp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 12h4")
            addPathData("M20 10v4")
            addPathData("M11 12h4")
            addPathData("M13 10v4")
            addPathData("M9 9C9 7.343 7.657 6 6 6h-.5C3.567 6 2 7.567 2 9.5v5C2 16.433 3.567 18 5.5 18h.5c1.657 0 3-1.343 3-3")
        }
        return _brandCpp!!
    }

private var _brandCpp: ImageVector? = null
