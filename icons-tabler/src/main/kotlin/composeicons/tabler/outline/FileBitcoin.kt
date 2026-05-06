package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileBitcoin: ImageVector
    get() {
        if (_fileBitcoin != null) return _fileBitcoin!!
        _fileBitcoin = tablerOutlineIcon(
            name = "FileBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M12 21h-5C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v2")
            addPathData("M17 21v-6M19 15v-1.5M19 22.5v-1.5M17 18h3M19 18h.5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-3.5M19 18h.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-3.5")
        }
        return _fileBitcoin!!
    }

private var _fileBitcoin: ImageVector? = null
