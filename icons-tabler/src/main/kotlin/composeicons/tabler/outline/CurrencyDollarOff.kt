package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDollarOff: ImageVector
    get() {
        if (_currencyDollarOff != null) return _currencyDollarOff!!
        _currencyDollarOff = tablerOutlineIcon(
            name = "CurrencyDollarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.7 8C16.293 6.845 15.224 6.053 14 6h-4M7.443 7.431c-.568 .926-.591 2.086-.061 3.034C7.913 11.413 8.914 12 10 12h2M16.564 16.558C16.02 17.453 15.048 18 14 18h-4C8.776 17.947 7.707 17.155 7.3 16")
            addPathData("M12 3v3M12 18v3")
            addPathData("M3 3 21 21")
        }
        return _currencyDollarOff!!
    }

private var _currencyDollarOff: ImageVector? = null
