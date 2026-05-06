package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GiftOff: ImageVector
    get() {
        if (_giftOff != null) return _giftOff!!
        _giftOff = tablerOutlineIcon(
            name = "GiftOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8h8c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-4M12 12h-8C3.448 12 3 11.552 3 11v-2C3 8.448 3.448 8 4 8h4")
            addPathData("M12 12v9")
            addPathData("M19 12v3M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-7")
            addPathData("M7.5 8C6.756 8 6.05 7.669 5.575 7.096 5.1 6.523 4.905 5.768 5.043 5.037M7.066 3.037C7.206 3.014 7.352 3 7.5 3 9.474 2.966 11.26 4.95 12 8c.74-3.05 2.526-5.034 4.5-5C17.881 3 19 4.119 19 5.5 19 6.881 17.881 8 16.5 8")
            addPathData("M3 3 21 21")
        }
        return _giftOff!!
    }

private var _giftOff: ImageVector? = null
