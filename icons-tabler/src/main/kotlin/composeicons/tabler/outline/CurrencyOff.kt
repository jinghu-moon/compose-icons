package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyOff: ImageVector
    get() {
        if (_currencyOff != null) return _currencyOff!!
        _currencyOff = tablerOutlineIcon(
            name = "CurrencyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.531 14.524c1.001-2.586 .381-5.519-1.58-7.479C14.989 5.085 12.056 4.468 9.471 5.471M7.049 7.053c-2.733 2.735-2.731 7.167 .004 9.899 2.735 2.733 7.167 2.731 9.899-.003")
            addPathData("M4 4 7 7")
            addPathData("M20 4 17 7")
            addPathData("M4 20 7 17")
            addPathData("M20 20 17 17")
            addPathData("M3 3 21 21")
        }
        return _currencyOff!!
    }

private var _currencyOff: ImageVector? = null
