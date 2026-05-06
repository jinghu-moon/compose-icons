package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPrismPlus: ImageVector
    get() {
        if (_hexagonalPrismPlus != null) return _hexagonalPrismPlus!!
        _hexagonalPrismPlus = tablerOutlineIcon(
            name = "HexagonalPrismPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.792 6.996 17.017 9.639c-.336 .235-.737 .361-1.147 .361h-7.74C7.72 10 7.32 9.874 6.984 9.638L3.21 6.997")
            addPathData("M8 10v11")
            addPathData("M16 10v3.5")
            addPathData("M21 12.5v-5.131c0-.655-.318-1.268-.853-1.643L16.78 3.363C16.444 3.127 16.044 3 15.633 3h-7.266c-.41 0-.811 .126-1.147 .363L3.853 5.726C3.318 6.102 2.999 6.716 3 7.37v9.261c0 .655 .318 1.269 .853 1.644l3.367 2.363c.336 .235 .737 .362 1.147 .362h4.133")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _hexagonalPrismPlus!!
    }

private var _hexagonalPrismPlus: ImageVector? = null
