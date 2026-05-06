package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadHorizontalPin: ImageVector
    get() {
        if (_deviceIpadHorizontalPin != null) return _deviceIpadHorizontalPin!!
        _deviceIpadHorizontalPin = tablerOutlineIcon(
            name = "DeviceIpadHorizontalPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-7C3.895 20 3 19.105 3 18v-12C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v5")
            addPathData("M9 17h3")
            addPathData("M21.121 20.121c.858-.858 1.115-2.148 .651-3.269C21.307 15.73 20.213 14.999 19 14.999c-1.213 0-2.307 .731-2.772 1.852-.464 1.121-.207 2.412 .651 3.269 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879")
            addPathData("M19 18v.01")
        }
        return _deviceIpadHorizontalPin!!
    }

private var _deviceIpadHorizontalPin: ImageVector? = null
