package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SteeringWheelOff: ImageVector
    get() {
        if (_steeringWheelOff != null) return _steeringWheelOff!!
        _steeringWheelOff = tablerOutlineIcon(
            name = "SteeringWheelOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.04 16.048C21.788 12.58 21.114 8.382 18.369 5.635 15.624 2.888 11.426 2.212 7.957 3.958M5.637 5.636C2.125 9.153 2.129 14.852 5.646 18.364c3.517 3.512 9.216 3.508 12.728-.009")
            addPathData("M10.595 10.576c-.781 .781-.782 2.047-.002 2.828 .781 .781 2.047 .782 2.828 .002")
            addPathData("M12 14v7")
            addPathData("M10 12 3.25 10")
            addPathData("M15.542 11.543 20.75 10")
            addPathData("M3 3 21 21")
        }
        return _steeringWheelOff!!
    }

private var _steeringWheelOff: ImageVector? = null
