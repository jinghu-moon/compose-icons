package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyLyd: ImageVector
    get() {
        if (_currencyLyd != null) return _currencyLyd!!
        _currencyLyd = tablerOutlineIcon(
            name = "CurrencyLyd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 15h.01")
            addPathData("M21 5v10c0 1.105-.895 2-2 2h-2.764c-.758-0-1.45-.428-1.789-1.106L14 15")
            addPathData("M5 8l2.773 4.687c.427 .697 .234 1.626-.43 2.075-.228 .155-.497 .238-.773 .238h-2.224c-.255-.001-.498-.107-.673-.293L3 14")
        }
        return _currencyLyd!!
    }

private var _currencyLyd: ImageVector? = null
