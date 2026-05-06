package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = tablerOutlineIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.7 8C16.293 6.845 15.224 6.053 14 6h-4C8.343 6 7 7.343 7 9c0 1.657 1.343 3 3 3h4c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4C8.776 17.947 7.707 17.155 7.3 16")
            addPathData("M12 3v3M12 18v3")
        }
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
