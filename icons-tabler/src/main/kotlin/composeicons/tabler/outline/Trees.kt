package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trees: ImageVector
    get() {
        if (_trees != null) return _trees!!
        _trees = tablerOutlineIcon(
            name = "Trees",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5l3 3L17 9l4 4-3 1 4 4h-9")
            addPathData("M15 21v-3")
            addPathData("M8 13 6 11")
            addPathData("M8 12l2-2")
            addPathData("M8 21v-13")
            addPathData("M5.824 16C4.938 15.948 4.121 15.507 3.592 14.795c-.529-.712-.716-1.622-.511-2.485C2.346 11.698 1.947 10.771 2.007 9.816 2.067 8.861 2.579 7.992 3.385 7.477 2.665 6.198 2.976 4.586 4.121 3.667 5.265 2.747 6.906 2.791 8 3.77c1.094-.977 2.734-1.02 3.878-.101 1.144 .919 1.455 2.53 .736 3.808 .806 .515 1.319 1.384 1.379 2.339 .06 .955-.339 1.881-1.074 2.494 .213 .893 .005 1.834-.564 2.555-.569 .72-1.437 1.141-2.355 1.14h-4L5.824 16")
        }
        return _trees!!
    }

private var _trees: ImageVector? = null
