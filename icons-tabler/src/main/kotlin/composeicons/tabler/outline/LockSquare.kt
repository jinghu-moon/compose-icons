package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockSquare: ImageVector
    get() {
        if (_lockSquare != null) return _lockSquare!!
        _lockSquare = tablerOutlineIcon(
            name = "LockSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6C8.448 16 8 15.552 8 15v-3")
            addPathData("M10 11v-2c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2")
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
        }
        return _lockSquare!!
    }

private var _lockSquare: ImageVector? = null
