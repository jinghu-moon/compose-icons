package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyHryvnia: ImageVector
    get() {
        if (_currencyHryvnia != null) return _currencyHryvnia!!
        _currencyHryvnia = tablerOutlineIcon(
            name = "CurrencyHryvnia",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 7C8.294 5.824 9.35 5 10.562 5h3.376c1.212-0 2.268 .824 2.562 2 .292 1.169-.267 2.383-1.344 2.922L9.28 12.86c-1.346 .673-2.075 2.164-1.78 3.64 .291 1.454 1.567 2.5 3.05 2.5h2.888c1.212 0 2.268-.824 2.562-2")
            addPathData("M6 10h12")
            addPathData("M6 14h12")
        }
        return _currencyHryvnia!!
    }

private var _currencyHryvnia: ImageVector? = null
