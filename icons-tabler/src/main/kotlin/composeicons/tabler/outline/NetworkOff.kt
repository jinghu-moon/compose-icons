package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NetworkOff: ImageVector
    get() {
        if (_networkOff != null) return _networkOff!!
        _networkOff = tablerOutlineIcon(
            name = "NetworkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.528 6.536c-1.026 2.275-.536 4.947 1.23 6.711 1.766 1.764 4.439 2.25 6.712 1.222M16.717 12.709c1.881-2.388 1.678-5.806-.472-7.955C14.095 2.605 10.678 2.403 8.29 4.284")
            addPathData("M12 3c1.333 .333 2 2.333 2 6 0 .337-.006 .66-.017 .968M13.433 13.441C13.1 14.325 12.623 14.844 12 15")
            addPathData("M12 3c-.936 .234-1.544 1.29-1.822 3.167M10.018 10.005c.116 3.029 .776 4.695 1.982 4.995")
            addPathData("M6 9h3M13 9h5")
            addPathData("M3 20h7")
            addPathData("M14 20h7")
            addPathData("M10 20c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 15v3")
            addPathData("M3 3 21 21")
        }
        return _networkOff!!
    }

private var _networkOff: ImageVector? = null
