package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeBitcoin: ImageVector
    get() {
        if (_eyeBitcoin != null) return _eyeBitcoin!!
        _eyeBitcoin = tablerOutlineIcon(
            name = "EyeBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13.193 17.924Q12.608 17.999 12 18 6.6 18 3 12 6.6 6 12 6q4.508 0 7.761 4.181")
            addPathData("M17 21v-6M19 15v-1.5M19 22.5v-1.5M17 18h3M19 18h.5c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-3.5M19 18h.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-3.5")
        }
        return _eyeBitcoin!!
    }

private var _eyeBitcoin: ImageVector? = null
