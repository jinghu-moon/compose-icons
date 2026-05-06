package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSolidjs: ImageVector
    get() {
        if (_brandSolidjs != null) return _brandSolidjs!!
        _brandSolidjs = tablerOutlineIcon(
            name = "BrandSolidjs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17.5c4.667 3 8 4.5 10 4.5 2.5 0 4-1.5 4-3.5C16 16.5 14.5 15 12 15c-2 0-5.333 .833-10 2.5")
            addPathData("M5 13.5C9.667 11.833 13 11 15 11c2.5 0 4 1.5 4 3.5 0 .738-.204 1.408-.588 1.96l-2.883 3.825")
            addPathData("M22 6.5C18 3.5 14 2 12 2 9.96 2 9.382 2.463 8.581 3.545")
            addPathData("M2 17.5l3-4")
            addPathData("M22 6.5l-3 4")
            addPathData("M8.581 3.545 5.628 7.256")
            addPathData("M7.416 12.662C5.906 12.186 5 11.183 5 9.5 5 7 6.5 6 9 6c1.688 0 5.087 1.068 8.198 3.204 .605 .426 1.206 .858 1.802 1.296l-2.302 .785")
        }
        return _brandSolidjs!!
    }

private var _brandSolidjs: ImageVector? = null
