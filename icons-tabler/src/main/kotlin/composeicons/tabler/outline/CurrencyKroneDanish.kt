package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyKroneDanish: ImageVector
    get() {
        if (_currencyKroneDanish != null) return _currencyKroneDanish!!
        _currencyKroneDanish = tablerOutlineIcon(
            name = "CurrencyKroneDanish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6v12")
            addPathData("M5 12c3.5 0 6-3 6-6")
            addPathData("M5 12c3.5 0 6 3 6 6")
            addPathData("M15 10v8")
            addPathData("M19 10c-2.209 0-4 1.791-4 4")
            addPathData("M20 18.01v-.01")
        }
        return _currencyKroneDanish!!
    }

private var _currencyKroneDanish: ImageVector? = null
