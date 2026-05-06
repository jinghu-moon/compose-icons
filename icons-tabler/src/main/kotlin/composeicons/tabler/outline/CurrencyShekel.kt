package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyShekel: ImageVector
    get() {
        if (_currencyShekel != null) return _currencyShekel!!
        _currencyShekel = tablerOutlineIcon(
            name = "CurrencyShekel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 18v-12h4c2.209 0 4 1.791 4 4v4")
            addPathData("M18 6v12h-4c-2.209 0-4-1.791-4-4v-4")
        }
        return _currencyShekel!!
    }

private var _currencyShekel: ImageVector? = null
