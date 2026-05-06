package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyPeso: ImageVector
    get() {
        if (_currencyPeso != null) return _currencyPeso!!
        _currencyPeso = tablerOutlineIcon(
            name = "CurrencyPeso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 19v-14h3.5C13.985 5 16 7.015 16 9.5 16 11.985 13.985 14 11.5 14h-3.5")
            addPathData("M18 8h-12")
            addPathData("M18 11h-12")
        }
        return _currencyPeso!!
    }

private var _currencyPeso: ImageVector? = null
