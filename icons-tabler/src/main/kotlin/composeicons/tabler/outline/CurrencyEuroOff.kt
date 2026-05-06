package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyEuroOff: ImageVector
    get() {
        if (_currencyEuroOff != null) return _currencyEuroOff!!
        _currencyEuroOff = tablerOutlineIcon(
            name = "CurrencyEuroOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.2 7C15.223 4.74 12.246 4.398 9.966 5.96M8.053 8.039c-1.604 2.72-1.374 6.469 .69 8.894 2.292 2.691 6 2.758 8.356 .18")
            addPathData("M10 10h-5M5 14h8")
            addPathData("M3 3 21 21")
        }
        return _currencyEuroOff!!
    }

private var _currencyEuroOff: ImageVector? = null
