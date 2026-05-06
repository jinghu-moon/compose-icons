package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyPaanga: ImageVector
    get() {
        if (_currencyPaanga != null) return _currencyPaanga!!
        _currencyPaanga = tablerOutlineIcon(
            name = "CurrencyPaanga",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 6h-4C15.343 6 14 7.343 14 9c0 1.657 1.343 3 3 3h1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4")
            addPathData("M17 20v-2")
            addPathData("M18 6v-2")
            addPathData("M3 6h8")
            addPathData("M7 6v12")
        }
        return _currencyPaanga!!
    }

private var _currencyPaanga: ImageVector? = null
