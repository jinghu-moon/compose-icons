package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bulb: ImageVector
    get() {
        if (_bulb != null) return _bulb!!
        _bulb = tablerOutlineIcon(
            name = "Bulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h1M12 3v1M20 12h1M5.6 5.6l.7 .7M18.4 5.6l-.7 .7")
            addPathData("M9 16C7.278 14.709 6.576 12.461 7.257 10.419 7.937 8.377 9.848 7 12 7c2.152 0 4.063 1.377 4.743 3.419C17.424 12.461 16.722 14.709 15 16c-.792 .784-1.163 1.898-1 3 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 .163-1.102-.208-2.216-1-3")
            addPathData("M9.7 17h4.6")
        }
        return _bulb!!
    }

private var _bulb: ImageVector? = null
