package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyNaira: ImageVector
    get() {
        if (_currencyNaira != null) return _currencyNaira!!
        _currencyNaira = tablerOutlineIcon(
            name = "CurrencyNaira",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18v-10.948c-0-.479 .323-.897 .787-1.017 .463-.12 .949 .088 1.181 .507l6.064 10.916c.232 .418 .718 .627 1.181 .507 .463-.12 .787-.538 .787-1.017v-10.948")
            addPathData("M5 10h14")
            addPathData("M5 14h14")
        }
        return _currencyNaira!!
    }

private var _currencyNaira: ImageVector? = null
