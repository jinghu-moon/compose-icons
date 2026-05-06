package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyYen: ImageVector
    get() {
        if (_currencyYen != null) return _currencyYen!!
        _currencyYen = tablerOutlineIcon(
            name = "CurrencyYen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v-7L7 5M17 5l-5 7")
            addPathData("M8 17h8")
            addPathData("M8 13h8")
        }
        return _currencyYen!!
    }

private var _currencyYen: ImageVector? = null
