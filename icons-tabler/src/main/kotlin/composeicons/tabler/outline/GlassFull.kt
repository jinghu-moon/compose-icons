package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlassFull: ImageVector
    get() {
        if (_glassFull != null) return _glassFull!!
        _glassFull = tablerOutlineIcon(
            name = "GlassFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8")
            addPathData("M12 15v6")
            addPathData("M17 3l1 7c0 3.012-2.686 5-6 5C8.686 15 6 13.012 6 10L7 3h10")
            addPathData("M6 10c1.778-1.333 4.222-1.333 6 0 1.778 1.333 4.222 1.333 6 0")
        }
        return _glassFull!!
    }

private var _glassFull: ImageVector? = null
