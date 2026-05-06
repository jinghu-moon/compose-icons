package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Highlight: ImageVector
    get() {
        if (_highlight != null) return _highlight!!
        _highlight = tablerOutlineIcon(
            name = "Highlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19h4L17.5 8.5c1.105-1.105 1.105-2.895 0-4-1.105-1.105-2.895-1.105-4 0L3 15v4")
            addPathData("M12.5 5.5l4 4")
            addPathData("M4.5 13.5l4 4")
            addPathData("M21 15v4h-8l4-4h4")
        }
        return _highlight!!
    }

private var _highlight: ImageVector? = null
