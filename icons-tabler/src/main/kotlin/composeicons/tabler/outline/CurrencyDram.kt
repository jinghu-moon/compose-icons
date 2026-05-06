package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDram: ImageVector
    get() {
        if (_currencyDram != null) return _currencyDram!!
        _currencyDram = tablerOutlineIcon(
            name = "CurrencyDram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10C4 6.686 6.686 4 10 4c3.314 0 6 2.686 6 6v10")
            addPathData("M12 16h8")
            addPathData("M12 12h8")
        }
        return _currencyDram!!
    }

private var _currencyDram: ImageVector? = null
