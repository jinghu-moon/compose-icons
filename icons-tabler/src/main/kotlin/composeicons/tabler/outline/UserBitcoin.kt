package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserBitcoin: ImageVector
    get() {
        if (_userBitcoin != null) return _userBitcoin!!
        _userBitcoin = tablerOutlineIcon(
            name = "UserBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 21v-6M19 15v-1.5M19 22.5v-1.5M17 18h3M19 18h.5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-3.5M19 18h.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-3.5")
            addPathData("M8 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7")
            addPathData("M6 21v-2c0-2.209 1.791-4 4-4h3")
        }
        return _userBitcoin!!
    }

private var _userBitcoin: ImageVector? = null
