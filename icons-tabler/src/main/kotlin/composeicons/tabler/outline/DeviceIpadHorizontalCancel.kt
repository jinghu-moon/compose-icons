package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadHorizontalCancel: ImageVector
    get() {
        if (_deviceIpadHorizontalCancel != null) return _deviceIpadHorizontalCancel!!
        _deviceIpadHorizontalCancel = tablerOutlineIcon(
            name = "DeviceIpadHorizontalCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-7C3.895 20 3 19.105 3 18v-12C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v6.5")
            addPathData("M9 17h3.5")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
        }
        return _deviceIpadHorizontalCancel!!
    }

private var _deviceIpadHorizontalCancel: ImageVector? = null
