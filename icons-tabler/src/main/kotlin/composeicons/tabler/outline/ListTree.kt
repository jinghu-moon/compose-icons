package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ListTree: ImageVector
    get() {
        if (_listTree != null) return _listTree!!
        _listTree = tablerOutlineIcon(
            name = "ListTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6h11")
            addPathData("M12 12h8")
            addPathData("M15 18h5")
            addPathData("M5 6v.01")
            addPathData("M8 12v.01")
            addPathData("M11 18v.01")
        }
        return _listTree!!
    }

private var _listTree: ImageVector? = null
