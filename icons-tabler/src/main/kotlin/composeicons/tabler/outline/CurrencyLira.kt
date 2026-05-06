package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyLira: ImageVector
    get() {
        if (_currencyLira != null) return _currencyLira!!
        _currencyLira = tablerOutlineIcon(
            name = "CurrencyLira",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5v15c3.866 0 7-3.134 7-7")
            addPathData("M6 15l8-4")
            addPathData("M14 7 6 11")
        }
        return _currencyLira!!
    }

private var _currencyLira: ImageVector? = null
