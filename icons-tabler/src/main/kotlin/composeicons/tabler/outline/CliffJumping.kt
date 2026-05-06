package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CliffJumping: ImageVector
    get() {
        if (_cliffJumping != null) return _cliffJumping!!
        _cliffJumping = tablerOutlineIcon(
            name = "CliffJumping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 7c0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 6.448 15.552 6 15 6c-.552 0-1 .448-1 1")
            addPathData("M10.5 18 13 20l2-2")
            addPathData("M18 21l3-3L17 16 16 11")
            addPathData("M10.5 7.5l2 3L16 11 19 9l.5-3")
            addPathData("M4 21v-1L6 17l.5-2.5L8 12 7 7 8 4 7 3 5 3.5 3 3")
        }
        return _cliffJumping!!
    }

private var _cliffJumping: ImageVector? = null
