package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CoinEuro: ImageVector
    get() {
        if (_coinEuro != null) return _coinEuro!!
        _coinEuro = tablerOutlineIcon(
            name = "CoinEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M14.401 8C13.732 7.372 12.901 7 12 7 9.79 7 8 9.239 8 12c0 2.761 1.79 5 4 5 .9 0 1.731-.372 2.4-1")
            addPathData("M7 10.5h4")
            addPathData("M7 13.5h4")
        }
        return _coinEuro!!
    }

private var _coinEuro: ImageVector? = null
