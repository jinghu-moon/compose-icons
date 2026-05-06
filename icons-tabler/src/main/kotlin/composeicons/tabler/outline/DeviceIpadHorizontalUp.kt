package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadHorizontalUp: ImageVector
    get() {
        if (_deviceIpadHorizontalUp != null) return _deviceIpadHorizontalUp!!
        _deviceIpadHorizontalUp = tablerOutlineIcon(
            name = "DeviceIpadHorizontalUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-7C3.895 20 3 19.105 3 18v-12C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v6.5")
            addPathData("M9 17h3.5")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _deviceIpadHorizontalUp!!
    }

private var _deviceIpadHorizontalUp: ImageVector? = null
