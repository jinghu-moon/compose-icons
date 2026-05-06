package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) return _lockOpen!!
        _lockOpen = tablerOutlineIcon(
            name = "LockOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 13c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-6")
            addPathData("M11 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M8 11v-5C8 3.791 9.791 2 12 2c2.209 0 4 1.791 4 4")
        }
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
