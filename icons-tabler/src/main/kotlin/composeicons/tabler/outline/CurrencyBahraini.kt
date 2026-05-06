package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyBahraini: ImageVector
    get() {
        if (_currencyBahraini != null) return _currencyBahraini!!
        _currencyBahraini = tablerOutlineIcon(
            name = "CurrencyBahraini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10v1c0 2.209 1.791 4 4 4h2c1.105 0 2-.895 2-2v-3")
            addPathData("M7 19.01v-.01")
            addPathData("M14 15.01v-.01")
            addPathData("M17 15h2c.742-0 1.423-.411 1.769-1.068 .346-.657 .3-1.451-.12-2.063L17.996 8")
        }
        return _currencyBahraini!!
    }

private var _currencyBahraini: ImageVector? = null
