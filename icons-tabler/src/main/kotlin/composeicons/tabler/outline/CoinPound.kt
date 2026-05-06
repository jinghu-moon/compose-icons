package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CoinPound: ImageVector
    get() {
        if (_coinPound != null) return _coinPound!!
        _coinPound = tablerOutlineIcon(
            name = "CoinPound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M15 9C15 7.895 14.105 7 13 7c-1.105 0-2 .895-2 2v5c0 1.105-.895 2-2 2h6")
            addPathData("M9 12h4")
        }
        return _coinPound!!
    }

private var _coinPound: ImageVector? = null
