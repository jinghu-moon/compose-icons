package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencySolana: ImageVector
    get() {
        if (_currencySolana != null) return _currencySolana!!
        _currencySolana = tablerOutlineIcon(
            name = "CurrencySolana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18h12l4-4h-12L4 18")
            addPathData("M8 14 4 10h12l4 4")
            addPathData("M16 10 20 6h-12L4 10")
        }
        return _currencySolana!!
    }

private var _currencySolana: ImageVector? = null
