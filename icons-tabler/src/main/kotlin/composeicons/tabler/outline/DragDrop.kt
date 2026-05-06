package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DragDrop: ImageVector
    get() {
        if (_dragDrop != null) return _dragDrop!!
        _dragDrop = tablerOutlineIcon(
            name = "DragDrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 11v-2C19 7.895 18.105 7 17 7h-8C7.895 7 7 7.895 7 9v8c0 1.105 .895 2 2 2h2")
            addPathData("M13 13l9 3-4 2-2 4L13 13")
            addPathData("M3 3v.01")
            addPathData("M7 3v.01")
            addPathData("M11 3v.01")
            addPathData("M15 3v.01")
            addPathData("M3 7v.01")
            addPathData("M3 11v.01")
            addPathData("M3 15v.01")
        }
        return _dragDrop!!
    }

private var _dragDrop: ImageVector? = null
