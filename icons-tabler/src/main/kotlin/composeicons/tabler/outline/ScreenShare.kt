package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScreenShare: ImageVector
    get() {
        if (_screenShare != null) return _screenShare!!
        _screenShare = tablerOutlineIcon(
            name = "ScreenShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12v3c0 .552-.448 1-1 1h-16C3.448 16 3 15.552 3 15v-10C3 4.448 3.448 4 4 4h9")
            addPathData("M7 20h10")
            addPathData("M9 16v4")
            addPathData("M15 16v4")
            addPathData("M17 4h4v4")
            addPathData("M16 9 21 4")
        }
        return _screenShare!!
    }

private var _screenShare: ImageVector? = null
