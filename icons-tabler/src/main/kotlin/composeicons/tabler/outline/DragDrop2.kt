package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DragDrop2: ImageVector
    get() {
        if (_dragDrop2 != null) return _dragDrop2!!
        _dragDrop2 = tablerOutlineIcon(
            name = "DragDrop2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 10C8 8.895 8.895 8 10 8h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-8C8.895 20 8 19.105 8 18v-8")
            addPathData("M4 4v.01")
            addPathData("M8 4v.01")
            addPathData("M12 4v.01")
            addPathData("M16 4v.01")
            addPathData("M4 8v.01")
            addPathData("M4 12v.01")
            addPathData("M4 16v.01")
        }
        return _dragDrop2!!
    }

private var _dragDrop2: ImageVector? = null
