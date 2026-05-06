package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GridPattern: ImageVector
    get() {
        if (_gridPattern != null) return _gridPattern!!
        _gridPattern = tablerOutlineIcon(
            name = "GridPattern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M10 8v8")
            addPathData("M14 8v8")
            addPathData("M8 10h8")
            addPathData("M8 14h8")
        }
        return _gridPattern!!
    }

private var _gridPattern: ImageVector? = null
