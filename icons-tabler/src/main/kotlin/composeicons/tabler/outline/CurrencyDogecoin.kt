package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDogecoin: ImageVector
    get() {
        if (_currencyDogecoin != null) return _currencyDogecoin!!
        _currencyDogecoin = tablerOutlineIcon(
            name = "CurrencyDogecoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12h6")
            addPathData("M9 6v12")
            addPathData("M6 18h6c3.314 0 6-2.686 6-6C18 8.686 15.314 6 12 6h-6")
        }
        return _currencyDogecoin!!
    }

private var _currencyDogecoin: ImageVector? = null
