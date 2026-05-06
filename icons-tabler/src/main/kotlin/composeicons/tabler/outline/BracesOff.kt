package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracesOff: ImageVector
    get() {
        if (_bracesOff != null) return _bracesOff!!
        _bracesOff = tablerOutlineIcon(
            name = "BracesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.176 5.177C5.063 5.428 5 5.707 5 6v3c0 1.657-.895 3-2 3 1.105 0 2 1.343 2 3v3c0 1.105 .895 2 2 2")
            addPathData("M17 4c1.105 0 2 .895 2 2v3c0 1.657 .895 3 2 3-1.105 0-2 1.343-2 3M18.824 18.821C18.501 19.539 17.787 20 17 20")
            addPathData("M3 3 21 21")
        }
        return _bracesOff!!
    }

private var _bracesOff: ImageVector? = null
