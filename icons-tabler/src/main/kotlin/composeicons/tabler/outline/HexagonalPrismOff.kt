package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPrismOff: ImageVector
    get() {
        if (_hexagonalPrismOff != null) return _hexagonalPrismOff!!
        _hexagonalPrismOff = tablerOutlineIcon(
            name = "HexagonalPrismOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.792 6.996 17.017 9.639c-.336 .235-.737 .361-1.147 .361h-1.87M10 10h-1.87C7.72 10 7.32 9.874 6.984 9.638L3.21 6.997")
            addPathData("M8 10v11")
            addPathData("M16 10v2M16 16v5")
            addPathData("M20.972 16.968c.019-.111 .028-.224 .028-.337v-9.262c0-.655-.318-1.268-.853-1.643L16.78 3.363C16.444 3.127 16.044 3 15.633 3h-7.266c-.377-0-.747 .107-1.066 .309M4.956 4.952 3.853 5.726C3.318 6.102 2.999 6.716 3 7.37v9.261c0 .655 .318 1.269 .853 1.644l3.367 2.363c.336 .235 .737 .362 1.147 .362h7.265c.41 0 .811-.126 1.147-.363l2.26-1.587")
            addPathData("M3 3 21 21")
        }
        return _hexagonalPrismOff!!
    }

private var _hexagonalPrismOff: ImageVector? = null
