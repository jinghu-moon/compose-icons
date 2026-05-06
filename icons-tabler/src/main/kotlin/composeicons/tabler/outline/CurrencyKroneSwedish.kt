package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyKroneSwedish: ImageVector
    get() {
        if (_currencyKroneSwedish != null) return _currencyKroneSwedish!!
        _currencyKroneSwedish = tablerOutlineIcon(
            name = "CurrencyKroneSwedish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6v12")
            addPathData("M5 12c3.5 0 6-3 6-6")
            addPathData("M5 12c3.5 0 6 3 6 6")
            addPathData("M15 10v8")
            addPathData("M19 10c-2.209 0-4 1.791-4 4")
        }
        return _currencyKroneSwedish!!
    }

private var _currencyKroneSwedish: ImageVector? = null
