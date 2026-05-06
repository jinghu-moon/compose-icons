package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyRiyal: ImageVector
    get() {
        if (_currencyRiyal != null) return _currencyRiyal!!
        _currencyRiyal = tablerOutlineIcon(
            name = "CurrencyRiyal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9v2c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-1 1c0 1.105-.895 2-2 2C7.895 13 7 12.105 7 11v-1 4c0 1.105-.895 2-2 2C3.895 16 3 15.105 3 14v-2")
            addPathData("M18 12.01v-.01")
            addPathData("M22 10v1c0 2.761-2.239 5-5 5")
        }
        return _currencyRiyal!!
    }

private var _currencyRiyal: ImageVector? = null
