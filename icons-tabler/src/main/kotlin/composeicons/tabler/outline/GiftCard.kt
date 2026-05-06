package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GiftCard: ImageVector
    get() {
        if (_giftCard != null) return _giftCard!!
        _giftCard = tablerOutlineIcon(
            name = "GiftCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8C3 6.343 4.343 5 6 5h12c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-12C4.343 19 3 17.657 3 16v-8")
            addPathData("M7 16l3-3 3 3")
            addPathData("M8 13C7.211 13 6 12.328 6 11.5 6 10.672 6.711 10 7.5 10 8.628 9.98 9.577 11.17 10 13c.423-1.83 1.372-3.02 2.5-3 .789 0 1.5 .672 1.5 1.5C14 12.328 12.789 13 12 13h-4")
        }
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
