package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spider: ImageVector
    get() {
        if (_spider != null) return _spider!!
        _spider = tablerOutlineIcon(
            name = "Spider",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4v2l5 5")
            addPathData("M2.5 9.5 4 11h6")
            addPathData("M4 19v-2l6-6")
            addPathData("M19 4v2l-5 5")
            addPathData("M21.5 9.5 20 11h-6")
            addPathData("M20 19v-2L14 11")
            addPathData("M8 15c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 11 8 12.791 8 15")
            addPathData("M10 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7c-1.105 0-2 .895-2 2")
        }
        return _spider!!
    }

private var _spider: ImageVector? = null
