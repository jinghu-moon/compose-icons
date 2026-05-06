package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Abc: ImageVector
    get() {
        if (_abc != null) return _abc!!
        _abc = tablerOutlineIcon(
            name = "Abc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16v-6C3 8.895 3.895 8 5 8c1.105 0 2 .895 2 2v6")
            addPathData("M3 13h4")
            addPathData("M10 8v6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-1c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v1")
            addPathData("M20.732 12c-.453-.784-1.375-1.166-2.25-.932C17.608 11.303 17 12.095 17 13v1c0 .903 .605 1.694 1.477 1.93 .871 .236 1.793-.141 2.249-.92")
        }
        return _abc!!
    }

private var _abc: ImageVector? = null
