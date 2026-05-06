package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CardboardsOff: ImageVector
    get() {
        if (_cardboardsOff != null) return _cardboardsOff!!
        _cardboardsOff = tablerOutlineIcon(
            name = "CardboardsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.96 16.953c.026-.147 .04-.298 .04-.453v-8.5C21 6.895 20.105 6 19 6h-9M6 6h-1C3.895 6 3 6.895 3 8v8.5C3 17.881 4.119 19 5.5 19h1.06c.911-.002 1.772-.418 2.34-1.13l1.54-1.92c.38-.473 .953-.748 1.56-.748 .607 0 1.18 .275 1.56 .748l1.54 1.92c.568 .712 1.429 1.128 2.34 1.13h1.06c.155 0 .307-.014 .454-.041")
            addPathData("M7 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1C9 11.448 8.552 11 8 11c-.552 0-1 .448-1 1")
            addPathData("M16.714 12.7c.378-.393 .372-1.017-.015-1.402-.387-.385-1.01-.389-1.402-.009l1.417 1.41")
            addPathData("M3 3 21 21")
        }
        return _cardboardsOff!!
    }

private var _cardboardsOff: ImageVector? = null
