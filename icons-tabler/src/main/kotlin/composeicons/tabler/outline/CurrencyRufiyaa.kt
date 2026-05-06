package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRufiyaa: ImageVector
    get() {
        if (_currencyRufiyaa != null) return _currencyRufiyaa!!
        _currencyRufiyaa = tablerOutlineIcon(
            name = "CurrencyRufiyaa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 16h.01")
            addPathData("M4 16C13.5 12 15.5 8 18 7")
            addPathData("M12 8l5 3")
        }
        return _currencyRufiyaa!!
    }

private var _currencyRufiyaa: ImageVector? = null
