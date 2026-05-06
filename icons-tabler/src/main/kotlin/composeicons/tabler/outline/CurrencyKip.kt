package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyKip: ImageVector
    get() {
        if (_currencyKip != null) return _currencyKip!!
        _currencyKip = tablerOutlineIcon(
            name = "CurrencyKip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12h12")
            addPathData("M9 5v14")
            addPathData("M16 19C16 15.134 12.866 12 9 12c3.866 0 7-3.134 7-7")
        }
        return _currencyKip!!
    }

private var _currencyKip: ImageVector? = null
