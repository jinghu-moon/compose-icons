package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Exchange: ImageVector
    get() {
        if (_exchange != null) return _exchange!!
        _exchange = tablerOutlineIcon(
            name = "Exchange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 16.895 6.105 16 5 16c-1.105 0-2 .895-2 2")
            addPathData("M17 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 4.895 20.105 4 19 4c-1.105 0-2 .895-2 2")
            addPathData("M19 8v5c0 2.761-2.239 5-5 5h-3l3-3M14 21 11 18")
            addPathData("M5 16v-5C5 8.239 7.239 6 10 6h3L10 3M10 9 13 6")
        }
        return _exchange!!
    }

private var _exchange: ImageVector? = null
