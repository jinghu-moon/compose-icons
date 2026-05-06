package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BinaryTree2: ImageVector
    get() {
        if (_binaryTree2 != null) return _binaryTree2!!
        _binaryTree2 = tablerOutlineIcon(
            name = "BinaryTree2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M7 14C7 12.895 6.105 12 5 12c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M21 14c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M14 18c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M12 8v8")
            addPathData("M6.316 12.496 10.684 7.504")
            addPathData("M17.684 12.496 13.318 7.506")
        }
        return _binaryTree2!!
    }

private var _binaryTree2: ImageVector? = null
