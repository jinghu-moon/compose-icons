package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyZloty: ImageVector
    get() {
        if (_currencyZloty != null) return _currencyZloty!!
        _currencyZloty = tablerOutlineIcon(
            name = "CurrencyZloty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h-7l7-7h-7")
            addPathData("M17 18v-13")
            addPathData("M14 14.5 20 11")
        }
        return _currencyZloty!!
    }

private var _currencyZloty: ImageVector? = null
