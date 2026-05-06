package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStocktwits: ImageVector
    get() {
        if (_brandStocktwits != null) return _brandStocktwits!!
        _brandStocktwits = tablerOutlineIcon(
            name = "BrandStocktwits",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3 8 7.5 16 12")
            addPathData("M8 12l8 4.5L8 21")
        }
        return _brandStocktwits!!
    }

private var _brandStocktwits: ImageVector? = null
