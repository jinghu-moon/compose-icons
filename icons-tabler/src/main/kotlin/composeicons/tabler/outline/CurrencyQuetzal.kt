package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyQuetzal: ImageVector
    get() {
        if (_currencyQuetzal != null) return _currencyQuetzal!!
        _currencyQuetzal = tablerOutlineIcon(
            name = "CurrencyQuetzal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 8.686 15.314 6 12 6 8.686 6 6 8.686 6 12")
            addPathData("M13 13l5 5")
        }
        return _currencyQuetzal!!
    }

private var _currencyQuetzal: ImageVector? = null
