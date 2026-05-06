package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyLari: ImageVector
    get() {
        if (_currencyLari != null) return _currencyLari!!
        _currencyLari = tablerOutlineIcon(
            name = "CurrencyLari",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 13C18 9.686 15.314 7 12 7 8.686 7 6 9.686 6 13c0 3.314 2.686 6 6 6")
            addPathData("M6 19h12")
            addPathData("M10 5v7")
            addPathData("M14 12v-7")
        }
        return _currencyLari!!
    }

private var _currencyLari: ImageVector? = null
