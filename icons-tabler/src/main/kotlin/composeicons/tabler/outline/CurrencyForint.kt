package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyForint: ImageVector
    get() {
        if (_currencyForint != null) return _currencyForint!!
        _currencyForint = tablerOutlineIcon(
            name = "CurrencyForint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4h-4C5.343 4 4 5.343 4 7v12")
            addPathData("M10 11h-6")
            addPathData("M16 4v13c0 1.105 .895 2 2 2h2")
            addPathData("M19 9h-5")
        }
        return _currencyForint!!
    }

private var _currencyForint: ImageVector? = null
