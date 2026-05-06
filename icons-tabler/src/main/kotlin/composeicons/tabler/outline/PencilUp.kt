package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PencilUp: ImageVector
    get() {
        if (_pencilUp != null) return _pencilUp!!
        _pencilUp = tablerOutlineIcon(
            name = "PencilUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h4L18.5 9.5c1.105-1.105 1.105-2.895 0-4-1.105-1.105-2.895-1.105-4 0L4 16v4")
            addPathData("M13.5 6.5l4 4")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _pencilUp!!
    }

private var _pencilUp: ImageVector? = null
