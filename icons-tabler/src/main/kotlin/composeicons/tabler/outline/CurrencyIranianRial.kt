package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyIranianRial: ImageVector
    get() {
        if (_currencyIranianRial != null) return _currencyIranianRial!!
        _currencyIranianRial = tablerOutlineIcon(
            name = "CurrencyIranianRial",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4v9c0 1.105-.895 2-2 2h-1C4.343 15 3 13.657 3 12v-1")
            addPathData("M12 5v8c0 .552 .448 1 1 1h1c1.105 0 2-.895 2-2v-1")
            addPathData("M21 14v1.096c-0 2.294-1.562 4.293-3.787 4.85L17 20")
            addPathData("M11 18h.01")
            addPathData("M14 18h.01")
        }
        return _currencyIranianRial!!
    }

private var _currencyIranianRial: ImageVector? = null
