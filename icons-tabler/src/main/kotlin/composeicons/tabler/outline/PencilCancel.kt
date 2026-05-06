package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PencilCancel: ImageVector
    get() {
        if (_pencilCancel != null) return _pencilCancel!!
        _pencilCancel = tablerOutlineIcon(
            name = "PencilCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h4L18.5 9.5c1.105-1.105 1.105-2.895 0-4-1.105-1.105-2.895-1.105-4 0L4 16v4")
            addPathData("M13.5 6.5l4 4")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
        }
        return _pencilCancel!!
    }

private var _pencilCancel: ImageVector? = null
