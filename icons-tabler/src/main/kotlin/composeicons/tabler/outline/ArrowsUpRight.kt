package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsUpRight: ImageVector
    get() {
        if (_arrowsUpRight != null) return _arrowsUpRight!!
        _arrowsUpRight = tablerOutlineIcon(
            name = "ArrowsUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 21l4-4L17 13")
            addPathData("M21 17h-11C8.343 17 7 15.657 7 14v-11")
            addPathData("M11 7 7 3 3 7")
        }
        return _arrowsUpRight!!
    }

private var _arrowsUpRight: ImageVector? = null
