package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = tablerOutlineIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 8v-3C17 4.448 16.552 4 16 4h-10C4.895 4 4 4.895 4 6c0 1.105 .895 2 2 2h12c.552 0 1 .448 1 1v3M19 16v3c0 .552-.448 1-1 1h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M20 12v4h-4c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2h4")
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
