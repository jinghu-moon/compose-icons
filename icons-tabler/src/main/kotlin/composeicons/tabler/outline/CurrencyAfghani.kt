package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyAfghani: ImageVector
    get() {
        if (_currencyAfghani != null) return _currencyAfghani!!
        _currencyAfghani = tablerOutlineIcon(
            name = "CurrencyAfghani",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 13h-3.5C9.567 13 8 11.433 8 9.5 8 7.567 9.567 6 11.5 6 13.433 6 15 7.567 15 9.5v6.5h-7")
            addPathData("M12 3v.01")
            addPathData("M12 19v2")
        }
        return _currencyAfghani!!
    }

private var _currencyAfghani: ImageVector? = null
