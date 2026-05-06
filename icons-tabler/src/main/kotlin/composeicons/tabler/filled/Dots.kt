package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dots: ImageVector
    get() {
        if (_dots != null) return _dots!!
        _dots = tablerFilledIcon(
            name = "Dots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12c0 1.105-.895 2-2 2C3.895 14 3 13.105 3 12q0-.053 .005-.102C3.057 10.834 3.935 9.999 5 10c1.105 0 2 .895 2 2")
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2q0-.053 .005-.102C10.057 10.834 10.935 9.999 12 10c1.105 0 2 .895 2 2")
            addPathData("M21 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2q0-.053 .005-.102C17.057 10.834 17.935 9.999 19 10c1.105 0 2 .895 2 2")
        }
        return _dots!!
    }

private var _dots: ImageVector? = null
