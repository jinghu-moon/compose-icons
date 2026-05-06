package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shredder: ImageVector
    get() {
        if (_shredder != null) return _shredder!!
        _shredder = tablerOutlineIcon(
            name = "Shredder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11c0-.552 .448-1 1-1h14c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-14C4.448 15 4 14.552 4 14v-3")
            addPathData("M17 10v-4C17 4.895 16.105 4 15 4h-6C7.895 4 7 4.895 7 6v4M12 15v5M16 15v2M8 15v3")
        }
        return _shredder!!
    }

private var _shredder: ImageVector? = null
