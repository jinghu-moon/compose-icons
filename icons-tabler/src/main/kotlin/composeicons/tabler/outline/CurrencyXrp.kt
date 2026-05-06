package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyXrp: ImageVector
    get() {
        if (_currencyXrp != null) return _currencyXrp!!
        _currencyXrp = tablerOutlineIcon(
            name = "CurrencyXrp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5 8.585 8.585c1.886 1.886 4.944 1.886 6.83 0L19 5")
            addPathData("M5 19 8.585 15.415c1.886-1.886 4.944-1.886 6.83 0L19 18.999")
        }
        return _currencyXrp!!
    }

private var _currencyXrp: ImageVector? = null
