package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyBitcoin: ImageVector
    get() {
        if (_currencyBitcoin != null) return _currencyBitcoin!!
        _currencyBitcoin = tablerOutlineIcon(
            name = "CurrencyBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 6h8c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-8")
            addPathData("M8 6v12")
            addPathData("M8 12h6")
            addPathData("M9 3v3")
            addPathData("M13 3v3")
            addPathData("M9 18v3")
            addPathData("M13 18v3")
        }
        return _currencyBitcoin!!
    }

private var _currencyBitcoin: ImageVector? = null
