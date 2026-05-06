package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyEuro: ImageVector
    get() {
        if (_currencyEuro != null) return _currencyEuro!!
        _currencyEuro = tablerOutlineIcon(
            name = "CurrencyEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.2 7C14.844 4.307 11.068 4.337 8.744 7.067c-2.324 2.73-2.324 7.136 0 9.866 2.324 2.73 6.101 2.76 8.456 .067")
            addPathData("M13 10h-8M5 14h8")
        }
        return _currencyEuro!!
    }

private var _currencyEuro: ImageVector? = null
