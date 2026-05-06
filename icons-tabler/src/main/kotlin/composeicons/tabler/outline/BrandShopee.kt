package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandShopee: ImageVector
    get() {
        if (_brandShopee != null) return _brandShopee!!
        _brandShopee = tablerOutlineIcon(
            name = "BrandShopee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7l.867 12.143c.075 1.048 .949 1.86 2 1.857h10.276c1.051 .003 1.925-.809 2-1.857L20.01 7h-16-.01")
            addPathData("M8.5 7C8.5 5.347 10 3 12 3c2 0 3.5 2.347 3.5 4")
            addPathData("M9.5 17c.413 .462 1 1 2.5 1 1.5 0 2.5-.897 2.5-2 0-1.103-1-1.5-2.5-2-1.5-.5-2-1.47-2-2 0-1.104 1-2 2-2 1 0 1.5 0 2.5 1")
        }
        return _brandShopee!!
    }

private var _brandShopee: ImageVector? = null
