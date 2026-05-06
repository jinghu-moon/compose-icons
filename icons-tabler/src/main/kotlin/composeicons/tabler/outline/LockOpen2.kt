package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockOpen2: ImageVector
    get() {
        if (_lockOpen2 != null) return _lockOpen2!!
        _lockOpen2 = tablerOutlineIcon(
            name = "LockOpen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 13c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-10C3.895 21 3 20.105 3 19v-6")
            addPathData("M9 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M13 11v-4C13 4.791 14.791 3 17 3c2.209 0 4 1.791 4 4v4")
        }
        return _lockOpen2!!
    }

private var _lockOpen2: ImageVector? = null
