package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZzzOff: ImageVector
    get() {
        if (_zzzOff != null) return _zzzOff!!
        _zzzOff = tablerOutlineIcon(
            name = "ZzzOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h6L4 20h6")
            addPathData("M14 4h6l-5.146 6.862M16 12h4")
            addPathData("M3 3 21 21")
        }
        return _zzzOff!!
    }

private var _zzzOff: ImageVector? = null
