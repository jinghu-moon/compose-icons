package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyTugrik: ImageVector
    get() {
        if (_currencyTugrik != null) return _currencyTugrik!!
        _currencyTugrik = tablerOutlineIcon(
            name = "CurrencyTugrik",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 6h10")
            addPathData("M12 6v13")
            addPathData("M8 17l8-3")
            addPathData("M16 10 8 13")
        }
        return _currencyTugrik!!
    }

private var _currencyTugrik: ImageVector? = null
