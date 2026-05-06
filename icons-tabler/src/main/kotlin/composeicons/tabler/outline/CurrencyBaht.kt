package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyBaht: ImageVector
    get() {
        if (_currencyBaht != null) return _currencyBaht!!
        _currencyBaht = tablerOutlineIcon(
            name = "CurrencyBaht",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6h5c1.657 0 3 1.343 3 3v.143C16 10.721 14.721 12 13.143 12h-5.143")
            addPathData("M8 12h5c1.657 0 3 1.343 3 3v.143C16 16.721 14.721 18 13.143 18h-5.143")
            addPathData("M8 6v12")
            addPathData("M11 4v2")
            addPathData("M11 18v2")
        }
        return _currencyBaht!!
    }

private var _currencyBaht: ImageVector? = null
