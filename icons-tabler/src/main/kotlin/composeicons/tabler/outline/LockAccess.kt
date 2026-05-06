package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockAccess: ImageVector
    get() {
        if (_lockAccess != null) return _lockAccess!!
        _lockAccess = tablerOutlineIcon(
            name = "LockAccess",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M8 12c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6C8.448 16 8 15.552 8 15v-3")
            addPathData("M10 11v-2c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2")
        }
        return _lockAccess!!
    }

private var _lockAccess: ImageVector? = null
