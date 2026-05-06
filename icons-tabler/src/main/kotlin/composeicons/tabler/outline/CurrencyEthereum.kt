package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyEthereum: ImageVector
    get() {
        if (_currencyEthereum != null) return _currencyEthereum!!
        _currencyEthereum = tablerOutlineIcon(
            name = "CurrencyEthereum",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12 12 3l6 9-6 9L6 12")
            addPathData("M6 12 12 9l6 3-6 2L6 12")
        }
        return _currencyEthereum!!
    }

private var _currencyEthereum: ImageVector? = null
