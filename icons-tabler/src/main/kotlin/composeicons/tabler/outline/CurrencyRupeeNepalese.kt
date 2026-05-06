package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRupeeNepalese: ImageVector
    get() {
        if (_currencyRupeeNepalese != null) return _currencyRupeeNepalese!!
        _currencyRupeeNepalese = tablerOutlineIcon(
            name = "CurrencyRupeeNepalese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 5h-11 3c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-3l6 6")
            addPathData("M21 17 16.414 12.586c-.785-.758-2.032-.747-2.804 .024-.771 .771-.782 2.019-.024 2.804l.707 .707")
        }
        return _currencyRupeeNepalese!!
    }

private var _currencyRupeeNepalese: ImageVector? = null
