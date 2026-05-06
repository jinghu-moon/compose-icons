package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GitCompare: ImageVector
    get() {
        if (_gitCompare != null) return _gitCompare!!
        _gitCompare = tablerOutlineIcon(
            name = "GitCompare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.105 .895 2 2 2C7.105 8 8 7.105 8 6 8 4.895 7.105 4 6 4 4.895 4 4 4.895 4 6")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M11 6h5c1.105 0 2 .895 2 2v8")
            addPathData("M14 9 11 6 14 3")
            addPathData("M13 18h-5C6.895 18 6 17.105 6 16v-8")
            addPathData("M10 15l3 3-3 3")
        }
        return _gitCompare!!
    }

private var _gitCompare: ImageVector? = null
