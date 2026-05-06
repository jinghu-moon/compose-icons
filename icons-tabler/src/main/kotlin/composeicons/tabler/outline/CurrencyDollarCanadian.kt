package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDollarCanadian: ImageVector
    get() {
        if (_currencyDollarCanadian != null) return _currencyDollarCanadian!!
        _currencyDollarCanadian = tablerOutlineIcon(
            name = "CurrencyDollarCanadian",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 6h-4C15.343 6 14 7.343 14 9c0 1.657 1.343 3 3 3h1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4")
            addPathData("M10 18h-1C5.686 18 3 15.314 3 12 3 8.686 5.686 6 9 6h1")
            addPathData("M17 20v-2")
            addPathData("M18 6v-2")
        }
        return _currencyDollarCanadian!!
    }

private var _currencyDollarCanadian: ImageVector? = null
