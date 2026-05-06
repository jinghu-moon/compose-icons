package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyKroneCzech: ImageVector
    get() {
        if (_currencyKroneCzech != null) return _currencyKroneCzech!!
        _currencyKroneCzech = tablerOutlineIcon(
            name = "CurrencyKroneCzech",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6v12")
            addPathData("M5 12c3.5 0 6-3 6-6")
            addPathData("M5 12c3.5 0 6 3 6 6")
            addPathData("M19 6 17 8 15 6")
            addPathData("M19 12h-2c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3h2")
        }
        return _currencyKroneCzech!!
    }

private var _currencyKroneCzech: ImageVector? = null
