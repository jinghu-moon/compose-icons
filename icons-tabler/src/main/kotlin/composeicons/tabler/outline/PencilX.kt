package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PencilX: ImageVector
    get() {
        if (_pencilX != null) return _pencilX!!
        _pencilX = tablerOutlineIcon(
            name = "PencilX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h4L18.5 9.5c1.105-1.105 1.105-2.895 0-4-1.105-1.105-2.895-1.105-4 0L4 16v4")
            addPathData("M13.5 6.5l4 4")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _pencilX!!
    }

private var _pencilX: ImageVector? = null
