package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = tablerOutlineIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12")
            addPathData("M16 12v1.5C16 14.881 17.119 16 18.5 16 19.881 16 21 14.881 21 13.5v-1.5C21.005 8.029 18.407 4.524 14.606 3.374 10.806 2.224 6.7 3.701 4.503 7.009c-2.197 3.308-1.967 7.664 .567 10.722 2.534 3.058 6.772 4.093 10.43 2.549")
        }
        return _at!!
    }

private var _at: ImageVector? = null
