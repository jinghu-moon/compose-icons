package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Device3DCamera: ImageVector
    get() {
        if (_device3DCamera != null) return _device3DCamera!!
        _device3DCamera = tablerOutlineIcon(
            name = "Device3DCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2C11.895 10 11 9.105 11 8")
            addPathData("M8 6C8 4.343 9.343 3 11 3h4c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-4C9.343 21 8 19.657 8 18v-12")
            addPathData("M13 14v2")
        }
        return _device3DCamera!!
    }

private var _device3DCamera: ImageVector? = null
