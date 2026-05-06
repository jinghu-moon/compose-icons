package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyFlorin: ImageVector
    get() {
        if (_currencyFlorin != null) return _currencyFlorin!!
        _currencyFlorin = tablerOutlineIcon(
            name = "CurrencyFlorin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12h8")
            addPathData("M7 19c1.213 0 2.31-.723 2.788-1.838L14.212 6.838C14.69 5.723 15.787 5 17 5")
        }
        return _currencyFlorin!!
    }

private var _currencyFlorin: ImageVector? = null
