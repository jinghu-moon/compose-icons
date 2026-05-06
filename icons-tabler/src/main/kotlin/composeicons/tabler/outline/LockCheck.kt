package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockCheck: ImageVector
    get() {
        if (_lockCheck != null) return _lockCheck!!
        _lockCheck = tablerOutlineIcon(
            name = "LockCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-4.5C5.895 21 5 20.105 5 19v-6c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v.5")
            addPathData("M11 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M8 11v-4C8 4.791 9.791 3 12 3c2.209 0 4 1.791 4 4v4")
            addPathData("M15 19l2 2 4-4")
        }
        return _lockCheck!!
    }

private var _lockCheck: ImageVector? = null
