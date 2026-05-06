package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRubel: ImageVector
    get() {
        if (_currencyRubel != null) return _currencyRubel!!
        _currencyRubel = tablerOutlineIcon(
            name = "CurrencyRubel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 19v-14h6c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-8")
            addPathData("M14 15h-8")
        }
        return _currencyRubel!!
    }

private var _currencyRubel: ImageVector? = null
