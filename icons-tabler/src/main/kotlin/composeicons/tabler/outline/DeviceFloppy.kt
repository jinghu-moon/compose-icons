package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceFloppy: ImageVector
    get() {
        if (_deviceFloppy != null) return _deviceFloppy!!
        _deviceFloppy = tablerOutlineIcon(
            name = "DeviceFloppy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4h10l4 4v10c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4")
            addPathData("M10 14c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M14 4v4h-6v-4")
        }
        return _deviceFloppy!!
    }

private var _deviceFloppy: ImageVector? = null
