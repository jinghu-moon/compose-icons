package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDollarGuyanese: ImageVector
    get() {
        if (_currencyDollarGuyanese != null) return _currencyDollarGuyanese!!
        _currencyDollarGuyanese = tablerOutlineIcon(
            name = "CurrencyDollarGuyanese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 6h-4C15.343 6 14 7.343 14 9c0 1.657 1.343 3 3 3h1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4")
            addPathData("M10 6h-3C4.791 6 3 7.791 3 10v4c0 2.209 1.791 4 4 4h3v-6h-2")
            addPathData("M17 20v-2")
            addPathData("M18 6v-2")
        }
        return _currencyDollarGuyanese!!
    }

private var _currencyDollarGuyanese: ImageVector? = null
