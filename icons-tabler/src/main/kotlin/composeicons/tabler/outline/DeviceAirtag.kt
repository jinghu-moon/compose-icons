package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAirtag: ImageVector
    get() {
        if (_deviceAirtag != null) return _deviceAirtag!!
        _deviceAirtag = tablerOutlineIcon(
            name = "DeviceAirtag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12")
            addPathData("M9 15v.01")
            addPathData("M15 15C15 11.686 12.314 9 9 9")
            addPathData("M12 15C12 13.343 10.657 12 9 12")
        }
        return _deviceAirtag!!
    }

private var _deviceAirtag: ImageVector? = null
