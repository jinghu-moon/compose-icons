package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyWon: ImageVector
    get() {
        if (_currencyWon != null) return _currencyWon!!
        _currencyWon = tablerOutlineIcon(
            name = "CurrencyWon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6 7.245 17.358c.102 .359 .426 .609 .799 .617 .373 .008 .707-.228 .825-.582L12 8l3.131 9.393c.118 .354 .452 .59 .825 .582 .373-.008 .697-.258 .799-.617L20 6")
            addPathData("M21 10h-18")
            addPathData("M21 14h-18")
        }
        return _currencyWon!!
    }

private var _currencyWon: ImageVector? = null
