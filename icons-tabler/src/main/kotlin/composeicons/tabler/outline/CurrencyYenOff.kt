package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyYenOff: ImageVector
    get() {
        if (_currencyYenOff != null) return _currencyYenOff!!
        _currencyYenOff = tablerOutlineIcon(
            name = "CurrencyYenOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v-7M17 5 13.672 9.66")
            addPathData("M8 17h8")
            addPathData("M8 13h5")
            addPathData("M3 3 21 21")
        }
        return _currencyYenOff!!
    }

private var _currencyYenOff: ImageVector? = null
