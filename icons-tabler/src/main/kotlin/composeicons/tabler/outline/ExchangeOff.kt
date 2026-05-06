package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExchangeOff: ImageVector
    get() {
        if (_exchangeOff != null) return _exchangeOff!!
        _exchangeOff = tablerOutlineIcon(
            name = "ExchangeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 16.895 6.105 16 5 16c-1.105 0-2 .895-2 2")
            addPathData("M17 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 4.895 20.105 4 19 4c-1.105 0-2 .895-2 2")
            addPathData("M19 8v5c0 .594-.104 1.164-.294 1.692M17.014 16.99C16.147 17.647 15.088 18.002 14 18h-3l3-3")
            addPathData("M14 21 11 18")
            addPathData("M5 16v-5C5 9.368 5.782 7.918 6.992 7M10 6h3L10 3")
            addPathData("M11.501 7.499 13 6")
            addPathData("M3 3 21 21")
        }
        return _exchangeOff!!
    }

private var _exchangeOff: ImageVector? = null
