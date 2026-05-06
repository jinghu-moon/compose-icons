package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiaboloOff: ImageVector
    get() {
        if (_diaboloOff != null) return _diaboloOff!!
        _diaboloOff = tablerOutlineIcon(
            name = "DiaboloOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.727 4.749C4.26 5.129 4 5.553 4 6 4 7.217 5.933 8.265 8.71 8.735M12.967 8.978C16.929 8.8 20 7.534 20 6 20 4.343 16.418 3 12 3 10.34 3 8.798 3.19 7.52 3.514")
            addPathData("M4 6v.143c-0 .104 .016 .208 .048 .307L6 12 4.036 17.67c-.024 .086-.036 .175-.036 .265v.065c0 1.657 3.582 3 8 3 3.218 0 5.992-.712 7.262-1.74M19.051 15.033 18 12 19.952 6.45c.032-.099 .048-.203 .048-.307v-.143")
            addPathData("M6 12c0 1.105 2.686 2 6 2 .656 0 1.288-.035 1.879-.1M17.077 13.066C17.662 12.758 18 12.392 18 12")
            addPathData("M3 3 21 21")
        }
        return _diaboloOff!!
    }

private var _diaboloOff: ImageVector? = null
