package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadHorizontalDown: ImageVector
    get() {
        if (_deviceIpadHorizontalDown != null) return _deviceIpadHorizontalDown!!
        _deviceIpadHorizontalDown = tablerOutlineIcon(
            name = "DeviceIpadHorizontalDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-7C3.895 20 3 19.105 3 18v-12C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v6.5")
            addPathData("M9 17h3.5")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _deviceIpadHorizontalDown!!
    }

private var _deviceIpadHorizontalDown: ImageVector? = null
