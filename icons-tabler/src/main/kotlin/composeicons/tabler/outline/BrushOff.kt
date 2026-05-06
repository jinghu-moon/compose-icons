package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrushOff: ImageVector
    get() {
        if (_brushOff != null) return _brushOff!!
        _brushOff = tablerOutlineIcon(
            name = "BrushOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17C3 14.791 4.791 13 7 13c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-4v-4")
            addPathData("M21 3c-3.541 .484-6.819 2.14-9.309 4.704M9.896 9.916c-.69 1.025-1.259 2.127-1.696 3.284")
            addPathData("M21 3c-.484 3.538-2.137 6.812-4.697 9.302M14.108 14.088c-1.032 .698-2.142 1.272-3.308 1.712")
            addPathData("M3 3 21 21")
        }
        return _brushOff!!
    }

private var _brushOff: ImageVector? = null
