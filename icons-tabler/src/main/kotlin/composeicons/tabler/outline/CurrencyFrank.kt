package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyFrank: ImageVector
    get() {
        if (_currencyFrank != null) return _currencyFrank!!
        _currencyFrank = tablerOutlineIcon(
            name = "CurrencyFrank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 5h-6C9.895 5 9 5.895 9 7v12")
            addPathData("M7 15h4")
            addPathData("M9 11h7")
        }
        return _currencyFrank!!
    }

private var _currencyFrank: ImageVector? = null
