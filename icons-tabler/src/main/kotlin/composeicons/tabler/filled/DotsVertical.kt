package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DotsVertical: ImageVector
    get() {
        if (_dotsVertical != null) return _dotsVertical!!
        _dotsVertical = tablerFilledIcon(
            name = "DotsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2q0-.053 .005-.102C10.057 10.834 10.935 9.999 12 10c1.105 0 2 .895 2 2")
            addPathData("M14 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2q0-.052 .005-.102C10.057 17.834 10.935 16.999 12 17c1.105 0 2 .895 2 2")
            addPathData("M14 5c0 1.105-.895 2-2 2C10.895 7 10 6.105 10 5q0-.053 .005-.102C10.057 3.834 10.935 2.999 12 3c1.105 0 2 .895 2 2")
        }
        return _dotsVertical!!
    }

private var _dotsVertical: ImageVector? = null
