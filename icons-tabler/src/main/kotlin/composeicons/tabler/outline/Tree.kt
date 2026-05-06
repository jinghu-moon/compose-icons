package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = tablerOutlineIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13 10 11")
            addPathData("M12 12l2-2")
            addPathData("M12 21v-13")
            addPathData("M9.824 16C8.938 15.948 8.121 15.507 7.592 14.795c-.529-.712-.716-1.622-.511-2.485C6.346 11.698 5.947 10.771 6.007 9.816 6.067 8.861 6.579 7.992 7.385 7.477 6.665 6.198 6.976 4.586 8.121 3.667 9.265 2.747 10.906 2.791 12 3.77c1.094-.977 2.734-1.02 3.878-.101 1.144 .919 1.455 2.53 .736 3.808 .806 .515 1.319 1.384 1.379 2.339 .06 .955-.339 1.881-1.074 2.494 .213 .893 .005 1.834-.564 2.555-.569 .72-1.437 1.141-2.355 1.14h-4L9.824 16")
        }
        return _tree!!
    }

private var _tree: ImageVector? = null
