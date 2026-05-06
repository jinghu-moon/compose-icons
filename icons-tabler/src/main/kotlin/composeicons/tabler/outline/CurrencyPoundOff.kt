package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyPoundOff: ImageVector
    get() {
        if (_currencyPoundOff != null) return _currencyPoundOff!!
        _currencyPoundOff = tablerOutlineIcon(
            name = "CurrencyPoundOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 18.5c-1.587 .728-3.413 .728-5 0C10.34 17.927 8.513 18.11 7 19c1.093-.378 1.871-1.351 2-2.5v-7.5M10.192 6.175c.879-.866 2.108-1.278 3.331-1.117 1.223 .161 2.303 .878 2.927 1.942M13 13h-6")
            addPathData("M3 3 21 21")
        }
        return _currencyPoundOff!!
    }

private var _currencyPoundOff: ImageVector? = null
