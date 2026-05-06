package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandInfakt: ImageVector
    get() {
        if (_brandInfakt != null) return _brandInfakt!!
        _brandInfakt = tablerOutlineIcon(
            name = "BrandInfakt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.936 6.063c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M5.52 5C5.522 4.967 3.83 6.568 6.54 8.733c-1.092 2.015 .853 2.992 .853 2.992-.972 1.879 1.39 2.805 1.39 2.805-1 2.39-2 4.68-3.555 6.454 1.495 .09 2.04-.196 2.9-.844 3.386-2.552 4.937-6.471 5.765-8.62 .385-1.001-.323-2.47-1.247-2.964C10.126 7.206 5.468 5.03 5.519 5.001")
        }
        return _brandInfakt!!
    }

private var _brandInfakt: ImageVector? = null
