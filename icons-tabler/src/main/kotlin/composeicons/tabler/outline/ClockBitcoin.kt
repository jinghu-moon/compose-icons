package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockBitcoin: ImageVector
    get() {
        if (_clockBitcoin != null) return _clockBitcoin!!
        _clockBitcoin = tablerOutlineIcon(
            name = "ClockBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 21v-6M19 15v-1.5M19 22.5v-1.5M17 18h3M19 18h.5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-3.5M19 18h.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-3.5")
            addPathData("M20.866 10.45C20.021 5.618 15.463 2.352 10.617 3.107 5.77 3.861 2.42 8.357 3.083 13.217c.663 4.86 5.096 8.294 9.968 7.721")
            addPathData("M12 7v5l1.5 1.5")
        }
        return _clockBitcoin!!
    }

private var _clockBitcoin: ImageVector? = null
