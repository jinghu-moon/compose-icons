package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) return _wifiOff!!
        _wifiOff = tablerOutlineIcon(
            name = "WifiOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h.01")
            addPathData("M9.172 15.172c1.562-1.562 4.094-1.562 5.656 0")
            addPathData("M6.343 12.343c1.06-1.063 2.4-1.805 3.864-2.14M14.37 10.358c1.243 .388 2.371 1.075 3.287 2")
            addPathData("M3.515 9.515C4.538 8.489 5.739 7.658 7.059 7.06M10.16 6.14c3.783-.587 7.618 .667 10.325 3.374")
            addPathData("M3 3 21 21")
        }
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
