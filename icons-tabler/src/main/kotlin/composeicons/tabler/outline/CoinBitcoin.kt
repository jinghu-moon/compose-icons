package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CoinBitcoin: ImageVector
    get() {
        if (_coinBitcoin != null) return _coinBitcoin!!
        _coinBitcoin = tablerOutlineIcon(
            name = "CoinBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 8h4.09C14.145 8 15 8.895 15 10c0 1.105-.855 2-1.91 2 1.055 0 1.91 .895 1.91 2 0 1.105-.855 2-1.91 2h-4.09")
            addPathData("M10 12h4")
            addPathData("M10 7v10-9")
            addPathData("M13 7v1")
            addPathData("M13 16v1")
        }
        return _coinBitcoin!!
    }

private var _coinBitcoin: ImageVector? = null
