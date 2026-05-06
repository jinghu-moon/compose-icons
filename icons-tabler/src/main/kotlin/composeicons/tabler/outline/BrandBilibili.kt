package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBilibili: ImageVector
    get() {
        if (_brandBilibili != null) return _brandBilibili!!
        _brandBilibili = tablerOutlineIcon(
            name = "BrandBilibili",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10C3 7.791 4.791 6 7 6h10c2.209 0 4 1.791 4 4v6c0 2.209-1.791 4-4 4h-10C4.791 20 3 18.209 3 16v-6")
            addPathData("M8 3l2 3")
            addPathData("M16 3 14 6")
            addPathData("M9 13v-2")
            addPathData("M15 11v2")
        }
        return _brandBilibili!!
    }

private var _brandBilibili: ImageVector? = null
