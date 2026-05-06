package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FrameOff: ImageVector
    get() {
        if (_frameOff != null) return _frameOff!!
        _frameOff = tablerOutlineIcon(
            name = "FrameOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7h3M11 7h9")
            addPathData("M4 17h13")
            addPathData("M7 7v13")
            addPathData("M17 4v9M17 17v3")
            addPathData("M3 3 21 21")
        }
        return _frameOff!!
    }

private var _frameOff: ImageVector? = null
