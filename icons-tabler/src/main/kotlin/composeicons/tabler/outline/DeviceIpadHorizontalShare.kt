package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadHorizontalShare: ImageVector
    get() {
        if (_deviceIpadHorizontalShare != null) return _deviceIpadHorizontalShare!!
        _deviceIpadHorizontalShare = tablerOutlineIcon(
            name = "DeviceIpadHorizontalShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 20h-7.5C3.895 20 3 19.105 3 18v-12C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v7")
            addPathData("M9 17h3")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _deviceIpadHorizontalShare!!
    }

private var _deviceIpadHorizontalShare: ImageVector? = null
