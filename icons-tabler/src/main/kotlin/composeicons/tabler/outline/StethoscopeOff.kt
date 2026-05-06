package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StethoscopeOff: ImageVector
    get() {
        if (_stethoscopeOff != null) return _stethoscopeOff!!
        _stethoscopeOff = tablerOutlineIcon(
            name = "StethoscopeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.172 4.179C3.458 4.504 3 5.216 3 6v3.5c-0 2.354 1.498 4.447 3.726 5.206 2.228 .759 4.693 .016 6.13-1.848M14 10v-4C14 4.895 13.105 4 12 4h-1")
            addPathData("M8 15c-0 2.557 1.62 4.833 4.036 5.669 2.416 .837 5.097 .051 6.678-1.957M19.93 15.914C19.976 15.614 20 15.309 20 15v-3")
            addPathData("M11 3v2")
            addPathData("M18 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C22 8.895 21.105 8 20 8c-1.105 0-2 .895-2 2")
            addPathData("M3 3 21 21")
        }
        return _stethoscopeOff!!
    }

private var _stethoscopeOff: ImageVector? = null
