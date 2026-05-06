package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) return _eyeOff!!
        _eyeOff = tablerOutlineIcon(
            name = "EyeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.585 10.587c-.781 .781-.781 2.048 0 2.828 .781 .781 2.048 .781 2.828-0")
            addPathData("M16.681 16.673C15.278 17.551 13.655 18.011 12 18 8.4 18 5.4 16 3 12 4.272 9.88 5.712 8.322 7.32 7.326M10.18 6.18C10.779 6.059 11.389 5.998 12 6c3.6 0 6.6 2 9 6-.666 1.11-1.379 2.067-2.138 2.87")
            addPathData("M3 3 21 21")
        }
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
