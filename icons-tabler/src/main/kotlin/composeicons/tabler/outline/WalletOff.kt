package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WalletOff: ImageVector
    get() {
        if (_walletOff != null) return _walletOff!!
        _walletOff = tablerOutlineIcon(
            name = "WalletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 8v-3C17 4.448 16.552 4 16 4h-8M4.587 4.584c-.573 .572-.745 1.432-.436 2.18C4.461 7.512 5.191 8 6 8h2M12 8h6c.552 0 1 .448 1 1v3")
            addPathData("M19 19c0 .552-.448 1-1 1h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M16 12h4v4M16 16c-1.105 0-2-.895-2-2")
            addPathData("M3 3 21 21")
        }
        return _walletOff!!
    }

private var _walletOff: ImageVector? = null
