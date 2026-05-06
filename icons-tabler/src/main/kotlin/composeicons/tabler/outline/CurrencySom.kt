package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencySom: ImageVector
    get() {
        if (_currencySom != null) return _currencySom!!
        _currencySom = tablerOutlineIcon(
            name = "CurrencySom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 18v-12h-5v10c0 1.105-.895 2-2 2")
            addPathData("M14 6v12h4c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3h-4 4c1.657 0 3-1.343 3-3C21 7.343 19.657 6 18 6h-4")
        }
        return _currencySom!!
    }

private var _currencySom: ImageVector? = null
