package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDollarAustralian: ImageVector
    get() {
        if (_currencyDollarAustralian != null) return _currencyDollarAustralian!!
        _currencyDollarAustralian = tablerOutlineIcon(
            name = "CurrencyDollarAustralian",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 18 6.279 6.524C6.371 6.202 6.665 5.981 7 5.981c.335 0 .629 .222 .721 .543L11 18")
            addPathData("M21 6h-4C15.343 6 14 7.343 14 9c0 1.657 1.343 3 3 3h1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4")
            addPathData("M17 20v-2")
            addPathData("M18 6v-2")
            addPathData("M4.5 14h5")
        }
        return _currencyDollarAustralian!!
    }

private var _currencyDollarAustralian: ImageVector? = null
