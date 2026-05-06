package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRupee: ImageVector
    get() {
        if (_currencyRupee != null) return _currencyRupee!!
        _currencyRupee = tablerOutlineIcon(
            name = "CurrencyRupee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 5h-11 3c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-3l6 6")
            addPathData("M7 9h11")
        }
        return _currencyRupee!!
    }

private var _currencyRupee: ImageVector? = null
