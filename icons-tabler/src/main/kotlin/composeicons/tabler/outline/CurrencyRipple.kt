package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRipple: ImageVector
    get() {
        if (_currencyRipple != null) return _currencyRipple!!
        _currencyRipple = tablerOutlineIcon(
            name = "CurrencyRipple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 10.343 8.657 9 7 9 5.343 9 4 10.343 4 12")
            addPathData("M14 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C20 5.343 18.657 4 17 4 15.343 4 14 5.343 14 7")
            addPathData("M14 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M10 12h3L15 9.5")
            addPathData("M15 14.5 13 12")
        }
        return _currencyRipple!!
    }

private var _currencyRipple: ImageVector? = null
